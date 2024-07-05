package praxis.model.dto;

public class ProveedoresDTO {
	private long id ;
	private String nombre ;
	private String rut ;
	private String direccion;
	private String correo;
	private String telefono;
	private String contacto;
	private String telefono_contacto;
	public ProveedoresDTO() {
		super();
	}
	public ProveedoresDTO(long id, String nombre, String rut, String direccion, String correo, String telefono,
			String contacto, String telefono_contacto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.contacto = contacto;
		this.telefono_contacto = telefono_contacto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getTelefono_contacto() {
		return telefono_contacto;
	}
	public void setTelefono_contacto(String telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}
	
}
