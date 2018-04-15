<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<c:import url="../top.jsp"/>
	
	<h1>Inserir Produto</h1>
	 <form:form action= "${s:mvcUrl('PC#gravar').build()}" method="post"
        commandName="produto">

        <div class="form-group">
            <label>T�tulo</label>
            <form:input path="titulo" class="form-control"/>
            <form:errors path="titulo" />
        </div>
        <div class="form-group">
            <label>Descri��o</label>
            <form:textarea rows="10" cols="20" path="descricao" class="form-control" />
            <form:errors path="descricao" />
        </div>name

        <div class="form-group">
            <label>P�ginas</label> 
            <form:input type="text" path="paginas" class="form-control" />
            <form:errors path="paginas" />
        </div>

        <div class="form-group">
            <label>Data de lan�amento</label>
             <form:input path="dataLancamento" class="form-control"/>
            <form:errors path="dataLancamento" />
        </div>


        <c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
            <div class="form-group">
                <label>${tipoPreco}</label> 
                <form:input
                    path="precos[${status.index}].valor" class="form-control"/>
                 <form:input type="hidden"
                    path="precos[${status.index}].tipo" value="${tipoPreco}" />
            </div>
        </c:forEach>
        
        <div>
		    <label>Sum�rio</label>
		    <input class="form-control"name="sumario" type="file" />
		</div>
		
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form:form>
	
<c:import url="../bot.jsp"/>