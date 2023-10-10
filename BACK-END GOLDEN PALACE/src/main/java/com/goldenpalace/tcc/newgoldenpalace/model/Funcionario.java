package com.goldenpalace.tcc.newgoldenpalace.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Funcionario")
public class Funcionario {
	
	@Id // Chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto - Incremento
	private Long id;
	
	private String nome;
	private String tipoFuncionario;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;
	private String cpf;
	private String senha;
	
	private boolean codStatusFuncionario;
	
	public boolean getCodStatusFuncionario() {
		return codStatusFuncionario;
	}
	
	public void setCodStatusFuncionario(boolean codStatusFuncionario) {
		this.codStatusFuncionario = codStatusFuncionario;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
