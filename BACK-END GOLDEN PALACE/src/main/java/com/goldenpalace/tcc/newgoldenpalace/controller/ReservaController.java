package com.goldenpalace.tcc.newgoldenpalace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldenpalace.tcc.newgoldenpalace.model.Reserva;
import com.goldenpalace.tcc.newgoldenpalace.repository.ReservaRepository;

@Controller
@RequestMapping("/golden-palace/reserva")
public class ReservaController {

	@Autowired
	private ReservaRepository reservaRepository;
	
	@GetMapping("/listar")
	public String reserva(Reserva reserva, Model model) {
		
		model.addAttribute("reserva", reserva);
		
		return "reserva/lista-reserva";
	}
	
	@GetMapping ("/home")
	public String home(Model model) {
		return "home/index";
	}
	
	// Abrir o formulário de cadastro
	@GetMapping("/novo-reserva")
	public String novaReserva(Reserva reserva, Model model) {
		return "reserva/cadastro-reserva";
	}
	
	// Inserir usuario "Create"
	@PostMapping("/add-reserva")
	String addCliente(Reserva reserva, Model model) {
		
		reserva.setCodStatusReserva(true);
		
		Reserva reservaDb = reservaRepository.save(reserva);
		
		return "redirect:/golden-palace/reserva/sucesso";
	}
	
	// Carregar página de sucesso
	
	@GetMapping("/sucesso")
	String showPageSucess() {
		
		return "reserva/sucesso";
	}
}
