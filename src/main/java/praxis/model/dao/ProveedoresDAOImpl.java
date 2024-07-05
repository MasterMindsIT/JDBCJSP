package praxis.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import praxis.conexion.Conexion;
import praxis.model.dto.ProveedoresDTO;

public class ProveedoresDAOImpl implements IProveedoresDAO{

	@Override
	public void create(ProveedoresDTO p) {
		
		try {
			Connection c = Conexion.getCon();
			
			Statement s = c.createStatement();
			String sql ="insert into proveedores (nombre, rut, direccion, correo, telefono, contacto,telefono_contacto) values "+
												"('"+ p.getNombre()+"','"+p.getRut()+"','"+p.getDireccion()+"','"+p.getCorreo()+"','"+p.getTelefono()+"','"+p.getContacto()+"','"+p.getTelefono_contacto()+"')";
													
			ResultSet re = s.executeQuery(sql);
			
		} catch(SQLException e) {
			System.out.println("ERROR en método create(proveedores)");
			e.printStackTrace();
		}
		
	}

	@Override
	public ProveedoresDTO read(int id) {
		ProveedoresDTO p = null;
		
		try {
			Connection c = Conexion.getCon();
			
			Statement s = c.createStatement();
			String sql ="select id, nombre, rut, direccion, correo, telefono, contacto,telefono_contacto from proveedores where id = " + id;
			System.out.println(sql);
			ResultSet rs = s.executeQuery(sql);
			if (rs.next()) {
				p = new ProveedoresDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut")
						, rs.getString("direccion"), rs.getString("correo")
						, rs.getString("telefono"), rs.getString("contacto"),rs.getString("telefono_contacto"));
			}
		} catch(SQLException e) {
			System.out.println("ERROR en método read(id)");
			e.printStackTrace();
		}
		
		
		return p;
	}

	@Override
	public List<ProveedoresDTO> read() {
		List<ProveedoresDTO> proveedores = new ArrayList<ProveedoresDTO>();
		
		try {
			Connection c = Conexion.getCon();
		
			Statement s = c.createStatement();
			String sql ="select id, nombre, rut, direccion, correo, telefono, contacto,telefono_contacto from proveedores order by nombre asc";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
			
				proveedores.add(new ProveedoresDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut")
						, rs.getString("direccion"), rs.getString("correo")
						, rs.getString("telefono"), rs.getString("contacto"),rs.getString("telefono_contacto")));
				
			}		
			
		} catch (SQLException e) {
			System.out.println("ERROR en método read()");
			e.printStackTrace();
		}
		return proveedores;
	}

	@Override
	public void update(ProveedoresDTO a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String delete(int id) {
		try {
			Connection c = Conexion.getCon();
			
			Statement s = c.createStatement();
			String sql ="delete from proveedores where  id = " + id;
													
			ResultSet re =s.executeQuery(sql);
			
		} catch(SQLException e) {
			System.out.println("ERROR en método delete(id)");
			e.printStackTrace();
		}
		return "Borrado";
	}

}
