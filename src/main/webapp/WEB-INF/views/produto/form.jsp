<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="../top.jsp"/>
	
	<c:if test="${not empty retorno}">
		<div class="alert alert-info" role="alert">
		  ${retorno}
		</div>
	</c:if>
	
	<h1>Inserir Produto</h1>
	<form action="/casadocodigo2/produto/salvar" method="POST">
		<div class="form-group">
			<label>Titulo</label> 
			<input class="form-control" type="text" name="titulo">
		</div>

		<div class="form-group">
			<label>Descrição</label>
			<textarea class="form-control" rows="10" cols="20" name="descricao"></textarea>
		</div>

		<div class="form-group">
			<label>Paginas</label> 
			<input class="form-control" type="text" name="paginas">
		</div>

		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div class="form-group">
				<label>${tipoPreco}</label> <input class="form-control" type="text"
					name="precos[${status.index}].valor" /> <input type="hidden"
					name="precos[${status.index}].tipo" value="${tipoPreco}" />
			</div>
		</c:forEach>

		<button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>
	
<c:import url="../bot.jsp"/>