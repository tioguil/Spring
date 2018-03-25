package br.com.casadocodigo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDao produtoDao;	
		
	@RequestMapping("/produtos/form")
	public String form() {
		
		return "form";
	}
		
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto.toString());
		produtoDao.gravar(produto);
		return "ok";
		
	}
		
		
}
