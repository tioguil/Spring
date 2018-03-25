package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {

	private ProdutoDao dao;	
		
	@RequestMapping("/produtos/form")
	public String form() {
		
		return "form";
	}
		
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto.toString());
		
		return "ok";
		
	}
		
		
}
