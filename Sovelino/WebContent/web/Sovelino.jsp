<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="./plugins/bootstrap-4/css/bootstrap.min.css">

<!-- Load the AJAX API
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

      // Load the Visualization API and the piechart package.
      google.charts.load('current', {'packages':['corechart']});

      // Set a callback to run when the Google Visualization API is loaded.
      google.charts.setOnLoadCallback(drawChart);

      // Callback that creates and populates a data table, 
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() {

      // Create the data table.
      var data = new google.visualization.DataTable();
      data.addColumn('string', 'Topping');
      data.addColumn('number', 'Slices');
      data.addRows([
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2]
      ]);

      // Set chart options
      var options = {'title':'How Much Pizza I Ate Last Night',
                     'width':800,
                     'height': 250};

      // Instantiate and draw our chart, passing in some options.
      var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));
      chart.draw(data, options);
    }
    </script>
 -->
<!-- Title -->
<title>Sovelino</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary navbar-expand-lg"> <a
		class="navbar-brand" href="#">SOVELINO</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	</nav>
	<br>
	<center> <img src="logo.png" height="120" width="120"></center>
	<p> O Sovelino é uma ferramenta web para a resolução de problemas de programação linear através do método gráfico, com duas variáveis e sem limitações quanto ao número de restrições dos problemas.
	</p>
	<fieldset class="border p-2">
   <legend  class="w-auto">  &nbsp Resolução de problemas de programação linear &nbsp </legend>
	<div class="container">
	
	<form id="formulario" action="../Servlet"
		method="POST" class="container">
				<u><h5>PROBLEMA</h5></u>
	
						<label for="tipoProblema">O seu problema é de: </label> <select
							name="tipoProblema">
							<option value="maximizacao">Maximização</option>
							<option value="minimizacao">Minimização</option>
						</select>
				<hr>


				<legend>
				<bold>	<h5>FUNÇÃO OBJETIVO</h5></bold>
				</legend>
				Defina sua função objetivo: <input type="text" name="valorVariavelX"
					placeholder="Coeficiente de x"> x <select
					name="operadorFuncaoObjetivo">
					<option value="+">+</option>
					<option value="-">-</option>
				</select> <input type="text" name="valorVariavelY"
					placeholder="Coeficiente de y"> y = <input type="text"
					name="stObjetivo" placeholder="Maximizar lucro ..."> </br>
				<hr>
				<legend>
					<u><h5>VARIÁVEIS DE DECISÃO</h5></u>
				</legend>
				</br> x = <input type="text" name="stVariavelX"
					placeholder="Produção de Trigo"> U.M. <input type="text"
					name="stUnidadeMedidaX" placeholder="Kilo ..."> </br> y = <input
					type="text" name="stVariavelY" placeholder="Produção de Arroz">
				U.M. <input type="text" name="stUnidadeMedidaY"
					placeholder="Kilo ..."> </br>
				<hr>
				<legend>
					<u><h5>RESTRIÇÕES</h5></u>
				</legend>
				</br> Este problema está sujeito a: </br></br>
				<div id="restricoes" class="restricoes"></div>

				<!-- <button type="button" id="adicionarRestricao">Adicionar</button> -->
				
				<button type="button" id="adicionarRestricao" class="btn btn-outline-info">
        		  <span class="glyphicon glyphicon-plus"></span> + Adicionar restrição
        		</button>

				<button class="btn btn-success" id="btnOperacaoCalcular"
					name="btnOperacao" value="Calcular">Calcular</button>

				<hr />

				<legend>
					<u><h5>SOLUÇÃO ÓTIMA</h5></u>
				</legend>

				<div id="chart_div" style="width: 800; height: 250"></div>
	</form>
</div>
</fieldset>

<div class="footer-bottom-area">
            <div class="container h-100">
                <div class="row h-100">
                    <div class="col-12 h-100">
                        <div class="footer-bottom-content h-100 d-md-flex justify-content-between align-items-center">
                            <div class="copyright-text">
                                <p style="color:white;">
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template was made by GrubLube
</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</body>
<script src="javascript/jquery.min.js"></script>
<script src="plugins/bootstrap-4/js/bootstrap.min.js"></script>
<script src="javascript/script.js"></script>

</html>