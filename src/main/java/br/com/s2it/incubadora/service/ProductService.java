package br.com.s2it.incubadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.s2it.incubadora.model.Product;
import br.com.s2it.incubadora.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public void save(Product product){
		repository.persist(product);
	}
	
	public List<Product> listAll(){
		return repository.listAll();
	}
	
	public void update(Product product){
//		Product productFound = (Product) repository.findById(product.getId());
		
		repository.update(product);
	}
	
	public void delete(Product product){
		repository.delete(product);
	}
}
