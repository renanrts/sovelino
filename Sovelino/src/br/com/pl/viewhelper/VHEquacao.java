package br.com.pl.viewhelper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import br.com.pl.domain.Equacao;
import br.com.pl.domain.FuncaoObjetivo;
import br.com.pl.domain.Restricao;
import br.com.pl.domain.RestricaoLimite;

public class VHEquacao {

	public Equacao getEquacao(HttpServletRequest request) {
		int contador = Integer.parseInt(request.getParameter("qtdRestricoes"));
	
	
		String stObjetivo = request.getParameter("stObjetivo");
		String stVariavelX = request.getParameter("stVariavelX");
		String stVariavelY = request.getParameter("stVariavelY");
		
		
		FuncaoObjetivo funcaoObjetivo = new FuncaoObjetivo();
		funcaoObjetivo.setVariavelX(Double.parseDouble(request.getParameter("valorVariavelX")));
		funcaoObjetivo.setVariavelY(Double.parseDouble(request.getParameter("valorVariavelY")));
		funcaoObjetivo.setOperador(request.getParameter("operadorFuncaoObjetivo"));
		
		RestricaoLimite restricaoLimite = new RestricaoLimite();
		restricaoLimite.setLimiteInferiorX(Double.parseDouble(request.getParameter("limiteInferiorX")));
		restricaoLimite.setLimiteInferiorY(Double.parseDouble(request.getParameter("limiteInferiorY")));
		restricaoLimite.setLimiteSuperiorX(Double.parseDouble(request.getParameter("limiteSuperiorX")));
		restricaoLimite.setLimiteSuperiorY(Double.parseDouble(request.getParameter("limiteSuperiorY")));
		
		
		Restricao restricao = null;
		List<Restricao> restricoes = new ArrayList<>();
		
		for(int i = 1; i <= contador; i++) {
			restricao = new Restricao();
			restricao.setOperador(request.getParameter("operadorEquacaoRestricao"+i));
			restricao.setResultado(Double.parseDouble(request.getParameter("resultadoRestricao"+i)));
			restricao.setVariavelX(Double.parseDouble(request.getParameter("coeficienteX"+i)));
			restricao.setVariavelY(Double.parseDouble(request.getParameter("valorYRestricao"+i)));
			restricoes.add(restricao);
		}
			
		
		
		Equacao equacao = new Equacao();
		equacao.setTipoProblema(request.getParameter("tipoProblema"));
		equacao.setFuncObjetivo(funcaoObjetivo);
		equacao.setLimites(restricaoLimite);
		equacao.setRestricoes(restricoes);
		
		return equacao;
		
	}
}
