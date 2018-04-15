package br.com.casadocodigo.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.TipoPreco;

@Controller
@RequestMapping("/produto")
public class ProdutosController {

	@Autowired
	private ProdutoDao produtoDao;	
		
	@RequestMapping("/form")
	public ModelAndView form(){

        ModelAndView modelAndView = new ModelAndView("produto/form");
        modelAndView.addObject("tipos", TipoPreco.values());

        return modelAndView;
    }
		
	@RequestMapping("/salvar")
	public ModelAndView gravar(MultipartFile sumario, Produto produto, RedirectAttributes attributes) {
		System.out.println(produto.toString());
		produtoDao.gravar(produto);
		
		attributes.addFlashAttribute("retorno", "Produto cadastrado com Sucesso!");
		attributes.addFlashAttribute("tipos", TipoPreco.values());
        return new ModelAndView("redirect:/produtos/form");
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
	    List<Produto> produtos = produtoDao.listar();
	    ModelAndView modelAndView = new ModelAndView("produto/lista");
	    modelAndView.addObject("produtos", produtos);
	    return modelAndView;
	}
		
		
}
