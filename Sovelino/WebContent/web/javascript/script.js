var contador = 1;

	$("#adicionarRestricao").click(function(){
		
		var valorYRestricao = "valorYRestricao" + contador;
		var valorXRestricao = "valorXRestricao" + contador;

		$("#restricoes").append(`
				Restrição ` + contador + ` 
		      	<input type="number" name="coeficienteX${contador}" placeholder="Coeficiente de x"> x  
				<select name="operadorRestricao${contador}">
			        <option value="operadorSoma">+</option>
			        <option value="operadorSubtracap">-</option>
		     	</select>
		      	<input type="text" name="valorYRestricao${contador}" placeholder="Coeficiente de y"> y
		      	<select name="operadorEquacaoRestricao${contador}">
			        <option value="=">=</option>
			        <option value="<="><=</option>
			        <option value=">=">>=</option>
		     	</select>	
		     	<input type="text" name="resultadoRestricao${contador}" placeholder="Resultado da restrição">
		     	<br><br>
				`)
				contador++;
		
	})
	
	$("#formulario").submit(function(){
		$("#formulario").append(`
				<input type="hidden" name="qtdRestricoes" value="${--contador}">
		`)
	})