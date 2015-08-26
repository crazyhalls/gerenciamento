package br.com.s2it.incubadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.s2it.incubadora.model.Client;

import br.com.s2it.incubadora.repository.ClientRepository;


@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public void save(Client client){
		repository.persist(client);
	}
	
	public List<Client> listAll(){
		return repository.listAll();
	}
	
	public void update(Client client){		
		repository.update(client);
	}
	
	public void delete(Client client){
		repository.delete(client);
	}
	
	public boolean canRemove(int id){
		
		Client client = null;
		
		try {
			client = (Client) repository.findById(id);
		} catch (Exception e) {
			return false;
		}
		
		if(client != null){
			return true;
		}
		
		return false;
	}
}
