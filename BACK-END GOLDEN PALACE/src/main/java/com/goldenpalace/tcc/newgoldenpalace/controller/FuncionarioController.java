package com.goldenpalace.tcc.newgoldenpalace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldenpalace.tcc.newgoldenpalace.model.Funcionario;
import com.goldenpalace.tcc.newgoldenpalace.repository.FuncionarioRepository;

@Controller
@RequestMapping("/golden-palace/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/listar")
	public String funcionario(Funcionario funcionario, Model model) {
		
		model.addAttribute("funcionario", funcionario);
		
		return "funcionario/lista-funcionario";
	}
	
	@GetMapping ("/home")
	public String home(Model model) {
		return "home/index";
	}
	
	// Abrir o formulário de cadastro
	@GetMapping("/novo-funcionario")
	public String novoFuncionario(Funcionario funcionario, Model model) {
		return "funcionario/cadastro-funcionario";
	}
	
	// Inserir usuario "Create"
	@PostMapping("/add-funcionario")
	String addFuncionario(Funcionario funcionario, Model model) {
		
		funcionario.setCodStatusFuncionario(true);
		
		Funcionario funcionarioDb = funcionarioRepository.save(funcionario);
		
		return "redirect:/golden-palace/funcionario/sucesso";
	}
	
	// Carregar página de sucesso
	
	@GetMapping("/sucesso")
	String showPageSucess() {
		
		return "funcionario/sucesso";
	}
}
