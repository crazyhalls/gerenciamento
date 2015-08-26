package br.com.s2it.incubadora.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.s2it.incubadora.model.Client;
import br.com.s2it.incubadora.service.ClientService;

@RestController
@RequestMapping("/ed/client")
public class ClientEndpoint {

	@Autowired
	private ClientService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody Client client){
		
		service.save(client);
		
		return new ResponseEntity<Client> (HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> list(){
		
		return new ResponseEntity<List<Client>>(service.listAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody Client client){
		
		service.update(client);
		
		return new ResponseEntity<Client> (HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		
		service.delete(new Client(id));
		
		return new ResponseEntity<Client> (HttpStatus.OK);
	}
	
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> list(@PathVariable("id") int id){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		if(service.canRemove(id)){
			status = HttpStatus.OK;
		}
		
		return new ResponseEntity<Client>(status);
	}
}
