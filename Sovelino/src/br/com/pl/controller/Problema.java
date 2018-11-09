package br.com.pl.controller;

import java.util.List;

public class Problema {
	
	private String tipoProblema;
	private Double valorVariavelX;
	private String operadorFuncaoObjetivo;
	private Double valorVariavelY;
	private String stObjetivo;
	private String stVariavelX;
	private String stVariavelY;
	private List<Restricoes> restricoes;
	
	public Problema(String tipoProblema, Double valorVariavelX, String operadorFuncaoObjetivo, Double valorVariavelY, 
			String stObjetivo, 
			String stVariavelX, String stVariavelY, List<Restricoes> restricoes){
		
		this.tipoProblema = tipoProblema;
		this.valorVariavelX = valorVariavelX;
		this.operadorFuncaoObjetivo = operadorFuncaoObjetivo;
		this.valorVariavelY = valorVariavelY;
		this.stObjetivo = stObjetivo;
		this.stVariavelX = stVariavelX;
		this.stVariavelY = stVariavelY;
		this.restricoes = restricoes;	
	}
	
	public String getTipoProblema() {
		return tipoProblema;
	}
	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
	public Double getValorVariavelX() {
		return valorVariavelX;
	}
	public void setValorVariavelX(Double valorVariavelX) {
		this.valorVariavelX = valorVariavelX;
	}
	public String getOperadorFuncaoObjetivo() {
		return operadorFuncaoObjetivo;
	}
	public void setOperadorFuncaoObjetivo(String operadorFuncaoObjetivo) {
		this.operadorFuncaoObjetivo = operadorFuncaoObjetivo;
	}
	public Double getValorVariavelY() {
		return valorVariavelY;
	}
	public void setValorVariavelY(Double valorVariavelY) {
		this.valorVariavelY = valorVariavelY;
	}
	public String getStObjetivo() {
		return stObjetivo;
	}
	public void setStObjetivo(String stObjetivo) {
		this.stObjetivo = stObjetivo;
	}
	public String getStVariavelX() {
		return stVariavelX;
	}
	public void setStVariavelX(String stVariavelX) {
		this.stVariavelX = stVariavelX;
	}
	public String getStVariavelY() {
		return stVariavelY;
	}
	public void setStVariavelY(String stVariavelY) {
		this.stVariavelY = stVariavelY;
	}
	public List<Restricoes> getRestricoes() {
		return restricoes;
	}
	public void setRestricoes(List<Restricoes> restricoes) {
		this.restricoes = restricoes;
	}
	
	
	
	

}
