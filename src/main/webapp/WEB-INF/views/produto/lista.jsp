<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../top.jsp"/>

<h1>Lista de Produtos</h1>

<table class="table">
        <tr>
            <td>Título</td>
            <td>Descrição</td>
            <td>Páginas</td>
        </tr>
        <c:forEach items="${produtos}" var="produto">
	        <tr>
	            <td>${produto.titulo}</td>
	            <td>${produto.descricao}</td>
	            <td>${produto.paginas}</td>
	        </tr>
    	</c:forEach>
    </table>


<c:import url="../bot.jsp"/>