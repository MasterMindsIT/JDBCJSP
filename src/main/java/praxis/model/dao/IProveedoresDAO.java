package praxis.model.dao;

import java.util.List;

import praxis.model.dto.ProveedoresDTO;



public interface IProveedoresDAO {
	void create(ProveedoresDTO p);
	ProveedoresDTO read(int id);
	List<ProveedoresDTO> read();
	void update(ProveedoresDTO a);
	String delete(int id);
}
