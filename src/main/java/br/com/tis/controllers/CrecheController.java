package br.com.tis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.tis.domain.Creche;
import br.com.tis.services.CrecheService;

@Controller
@RequestMapping(value = "/creche")
public class CrecheController {
	
	@Autowired
	private CrecheService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView criancas() {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("criancas");
        return modelAndView;
	}
	
	@RequestMapping(value = "/atividades", method = RequestMethod.GET)
	public ModelAndView atividades() {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("atividades-criancas");
        return modelAndView;
	}
	
	/*@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find (@PathVariable Integer id){
		Creche creche = service.buscar(id);
		return ResponseEntity.ok(creche);
	}*/
}
