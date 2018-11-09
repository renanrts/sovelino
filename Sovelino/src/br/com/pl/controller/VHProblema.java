package br.com.pl.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class VHProblema {

	public Problema getProblema(HttpServletRequest request) {
		int contador = Integer.parseInt(request.getParameter("qtdRestricoes"));
		List<Restricoes> restricoes = new ArrayList<>();
		for(int i = 1; i <= contador; i++) {
			Restricoes restricao = new Restricoes();
			restricao.setValorXRestricao(Double.parseDouble(request.getParameter("coeficienteX"+i)));
			restricao.setOperadorRestricao(request.getParameter("operadorRestricao"+i));
			restricao.setValorYRestricao(Double.parseDouble(request.getParameter("valorYRestricao"+i)));
			restricao.setOperadorEquacaoRestricao(request.getParameter("operadorEquacaoRestricao"+i));
			restricao.setResultadoRestricao(request.getParameter("resultadoRestricao"+i));
			restricoes.add(restricao);
		}
			
	
		String tipoProblema = request.getParameter("tipoProblema");
		Double valorVariavelX = Double.parseDouble(request.getParameter("valorVariavelX"));
		String operadorFuncaoObjetivo  = request.getParameter("operadorFuncaoObjetivo");
		Double valorVariavelY = Double.parseDouble(request.getParameter("valorVariavelY"));
		String stObjetivo = request.getParameter("stObjetivo");
		String stVariavelX = request.getParameter("stVariavelX");
		String stVariavelY = request.getParameter("stVariavelY");
		
		
		
		
		Problema problema = new Problema(tipoProblema, valorVariavelX, operadorFuncaoObjetivo, valorVariavelY,stObjetivo , stVariavelX, stVariavelY, restricoes);
		return problema;
	}
}
