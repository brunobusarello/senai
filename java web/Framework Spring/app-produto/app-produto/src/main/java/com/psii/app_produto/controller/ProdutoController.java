package com.psii.app_produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psii.app_produto.model.Produto;
import com.psii.app_produto.repository.PedidoRepository;
import com.psii.app_produto.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "index";
    }

    @PostMapping("/saveProduto")
    public String saveProduct(@ModelAttribute Produto produto) {
        // TODO: process POST request
        produtoRepository.save(produto);
        return "redirect:/";
    }
}
