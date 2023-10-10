package com.goldenpalace.tcc.newgoldenpalace.model;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reserva")
public class Reserva {

	@Id // Chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto - Incremento
	private Long id;
	
	private String area;
	private int pessoas;
	private String observacao;
	private LocalTime horario;
	private LocalDate dataSolicitada;
	private LocalDate dataReservada;
	
	private boolean codStatusReserva;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public LocalDate getDataSolicitada() {
		return dataSolicitada;
	}

	public void setDataSolicitada(LocalDate dataSolicitada) {
		this.dataSolicitada = dataSolicitada;
	}

	public LocalDate getDataReservada() {
		return dataReservada;
	}

	public void setDataReservada(LocalDate dataReservada) {
		this.dataReservada = dataReservada;
	}

	public boolean getCodStatusReserva() {
		return codStatusReserva;
	}

	public void setCodStatusReserva(boolean codStatusReserva) {
		this.codStatusReserva = codStatusReserva;
	}

}
