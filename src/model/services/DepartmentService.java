package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){                 // Mock(mocar os dados)
		List<Department> list = new ArrayList<>();   
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(1, "Eletronics"));
		return list;
	}
}
