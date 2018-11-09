package br.com.pl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlet
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		VHProblema vhproblema = new VHProblema();
		Problema problema = vhproblema.getProblema(request);
		Calculo calc = new Calculo();
		calc.solucaoOtima(problema);
		
		PrintWriter out = response.getWriter();
        out.println("<html><body>tipoProblema: " + problema.getTipoProblema() + " / getValorVariavelX: " + problema.getValorVariavelX() + " / getOperadorFuncaoObjetivo: " + problema.getOperadorFuncaoObjetivo() + " / getValorVariavelY: " + problema.getValorVariavelY() + " / getStObjetivo: " + problema.getStObjetivo() + " / getStVariavelX: " + problema.getStVariavelX() + " / getStVariavelY(): " + problema.getStVariavelY()  +  " / getValorXRestricao(1):"  + problema.getRestricoes().get(0).getValorXRestricao() + "</body></html>");
		
	}

}
