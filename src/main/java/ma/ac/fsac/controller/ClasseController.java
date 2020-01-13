package ma.ac.fsac.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.ac.fsac.entities.Classe;
import ma.ac.fsac.services.ClasseService;

@Controller
@RequestMapping("/classe")
public class ClasseController {
	@Autowired
	private ClasseService classeService;
	@GetMapping("/")
	public String classeHome(Model model){
		model.addAttribute("classes", classeService.getAll());
		return "pages/classes";
	}
	@GetMapping("/new")
	public String classeNew(Model model){
		model.addAttribute("classe", new Classe());
		return "pages/classe_edit";
	}
	@PostMapping("/save")
	public String classeSave(@Valid @ModelAttribute("classe") Classe classe,BindingResult bindingResult,Model model ){
		if(bindingResult.hasErrors()){
			model.addAttribute("classe", classe);
			return "pages/classe_edit";
		}
		classeService.save(classe);
		return "redirect:/classe/";
	}
	

}
