package br.com.s2it.incubadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.s2it.incubadora.model.Client;
import br.com.s2it.incubadora.service.ClientService;



@Controller
@RequestMapping("/client")
public class ClientController {

	public static final String VIEW = "client";
	
	@Autowired
	private ClientService service;
	
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView save(Client client){    	
    	
    	service.save(client);
    	
        return listAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView listAll(){    	
    	
    	ModelAndView modView = new ModelAndView(VIEW);
    	modView.addObject("client", service.listAll());
    	modView.addObject("tes", "dsdasdasdsad");
        return modView;
    }
}
