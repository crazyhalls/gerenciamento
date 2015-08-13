package br.com.s2it.incubadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView save(Product product){    	
    	
    	service.save(product);
    	
        return listAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView listAll(){    	
    	
    	ModelAndView modView = new ModelAndView(VIEW);
    	modView.addObject("products", service.listAll());
    	modView.addObject("tes", "dsdasdasdsad");
        return modView;
    }
}
