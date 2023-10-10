package com.goldenpalace.tcc.newgoldenpalace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldenpalace.tcc.newgoldenpalace.model.Cliente;
import com.goldenpalace.tcc.newgoldenpalace.repository.ClienteRepository;

@Controller
@RequestMapping("/golden-palace/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/listar")
	public String cliente(Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		
		return "cliente/lista-cliente";
	}
	
	@GetMapping ("/home")
	public String home(Model model) {
		return "home/index";
	}
	
	// Abrir o formulário de cadastro
	@GetMapping("/novo-cliente")
	public String novoCliente(Cliente cliente, Model model) {
		return "cliente/cadastro-cliente";
	}
	
	// Inserir usuario "Create"
	@PostMapping("/add-cliente")
	String addCliente(Cliente cliente, Model model) {
		
		cliente.setCodStatusCliente(true);
		
		Cliente clienteDb = clienteRepository.save(cliente);
		
		return "redirect:/golden-palace/cliente/sucesso";
	}
	
	// Carregar página de sucesso
	
	@GetMapping("/sucesso")
	String showPageSucess() {
		
		return "cliente/sucesso";
	}
}
