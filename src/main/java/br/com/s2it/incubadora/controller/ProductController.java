package br.com.s2it.incubadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.s2it.incubadora.model.Product;
import br.com.s2it.incubadora.service.ProductService;

/**
 * Created by root on 10/08/15.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

	public static final String VIEW = "prod";
	
	@Autowired
	private ProductService service;
	
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String save(Product product, ModelMap model){    	
    	
    	service.save(product);
    	
        return listAll(model);
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listAll(ModelMap model){    	
    	
    	model.addAttribute("products", service.listAll());
    	model.addAttribute("tes", "dsdasdasdsad");
        return VIEW;
    }
}
