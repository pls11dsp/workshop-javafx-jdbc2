package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){                 // Mock(mocar os dados)
		/*List<Seller> list = new ArrayList<>();   
		list.add(new Seller(1, "Books"));
		list.add(new Seller(2, "Computers"));
		list.add(new Seller(1, "Eletronics"));
		return list;*/
		return dao.findAll();
	}
	
	public void saveOrUpadate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
		
	}
}
