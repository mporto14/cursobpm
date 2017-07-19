<%@ page contentType="text/html"%>   
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 
<%@ taglib uri="http://fuego.com/jsp/ftl" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<html>
	<head>
		<title>Tela de aprovacao</title>
		<link rel="stylesheet" type="text/css" media="screen" href="<f:webResources relativePath='css/bootstrap.css'/>"/>
		<script src="<f:webResources relativePath='js/prototype.js'/>"></script>
		<script>
			function aprovar() { 
				document.getElementById('acao').value = 'APROVAR';
				document.getElementById('formPrincipal').submit();
			}
			
			function reprovar() { 
				document.getElementById('acao').value = 'REPROVAR';
				document.getElementById('formPrincipal').submit();
			}

			function buscarHistorico(motivo) { 
				console.log('bora!');
				new Ajax.Request("<f:invokeUrl var='dadosTela' methodName='buscarHistoricoReembolsos'/>", {
						method: "get",
						onSuccess: function(res) { 
							console.log('sucesso')
							console.log(res);

							$('#tabHistorico tr:last').after('<td>' + res.aprovador + '</td><td>' + 
										res.valor + "</td><td>" + res.observacao + '</td>');
							},
						onFailure: function(res) { 
							console.log('merda');
							console.log(res);
						}
					})
			}
		</script>

	</head>
	<body>
		<form id="formPrincipal" name="formPrincipal" method="post" action="<f:postResults/>">
			<input type="hidden" id="acao" <f:field att="dadosTela.acao"/> />
		</form>
		<div class="container">
			<div class="row">
				<div class="page-header">
				  <h1>Aprovacao de despesa de <c:out value="${dadosTela.despesa.motivo}" /></h1>
				</div>
			</div>
			<div class="row">
				<button class="btn" onclick="buscarHistorico('<c:out value="${dadosTela.despesa.motivo}" />');">Historico</button>
			</div>
			<div class="row">
				<table class="table" id="tabHistorico">
					<tr>
						<th>Aprovador</th>
						<th>Valor</th>
						<th>Observacao</th>
					</tr>
				</table>
			</div>
			<div class="row">
				<div class="col-md-6">
					<button class="btn btn-success" onclick="aprovar();">Aprovar</button>
				</div>
				<div class="col-md-6">
					<button class="btn btn-danger" onclick="reprovar();">Reprovar</button>
				</div>
			</div>
	</body>
</html>