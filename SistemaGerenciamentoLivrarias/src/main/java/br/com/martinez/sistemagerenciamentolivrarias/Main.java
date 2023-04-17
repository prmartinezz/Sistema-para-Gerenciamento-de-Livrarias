package br.com.martinez.sistemagerenciamentolivrarias;

import br.com.martinez.sistemagerenciamentolivrarias.model.CadastroCliente;
import br.com.martinez.sistemagerenciamentolivrarias.model.EnderecoCliente;
import br.com.martinez.sistemagerenciamentolivrarias.model.FormaPagamento;
import br.com.martinez.sistemagerenciamentolivrarias.model.Livro;
import br.com.martinez.sistemagerenciamentolivrarias.model.Vendas;

public class Main {

    public static void main(String[] args) {

        CadastroCliente pablo = new CadastroCliente();
        pablo.setNome("Pablo Martinez");
        pablo.setDtNasc("30/01/2003");
        pablo.setCpf("12345609122");
        pablo.setCodigo(111);
        
        EnderecoCliente enderecoPablo = new EnderecoCliente();
        enderecoPablo.setBairro("Jardim Gisela");
        enderecoPablo.setEstado("Paraná");
        enderecoPablo.setNumero(208);
        enderecoPablo.setPais("Brasil");
        enderecoPablo.setRua("Rua Barão do Rio Branco");
        
        Livro escolhaPablo01 = new Livro();
        escolhaPablo01.setAnoLancamento(2012);
        escolhaPablo01.setAutor("Rafael Mantovani");
        escolhaPablo01.setEditora("Objetiva");
        escolhaPablo01.setGenero("Auto-Ajuda");
        escolhaPablo01.setNumPagina(408);
        escolhaPablo01.setPreco((int) 40.00);
        escolhaPablo01.setQtdEstoque(10);
        escolhaPablo01.setQtdVendida(1);
        escolhaPablo01.setVlrVenda(40.00);
        
        Livro escolhaPablo02 = new Livro();
        escolhaPablo02.setAnoLancamento(1949);
        escolhaPablo02.setAutor("George Orwell");
        escolhaPablo02.setEditora("Sextante");
        escolhaPablo02.setGenero("Ficção Científica/Distopia");
        escolhaPablo02.setNumPagina(416);
        escolhaPablo02.setPreco((int) 54.90);
        escolhaPablo02.setQtdEstoque(9);
        escolhaPablo02.setQtdVendida(1);
        escolhaPablo02.setVlrVenda(54.90);
        
        Livro escolhaPablo03 = new Livro();
        escolhaPablo03.setAnoLancamento(1979);
        escolhaPablo03.setAutor("Douglas Adams");
        escolhaPablo03.setEditora("Sextante");
        escolhaPablo03.setGenero("Ficção Científica/Humor");
        escolhaPablo03.setNumPagina(160);
        escolhaPablo03.setPreco((int) 34.90);
        escolhaPablo03.setQtdEstoque(8);
        escolhaPablo03.setQtdVendida(1);
        escolhaPablo03.setVlrVenda(34.90);
        
        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.setCodigo(1);
        formaPagamento.setDescricao("Dinheiro");
        
        FormaPagamento formaPagamento02 = new FormaPagamento();
        formaPagamento02.setCodigo(2);
        formaPagamento02.setDescricao("Cartão de Crédito");
        
        Vendas vendas = new Vendas();
        vendas.setCliente(pablo);
        vendas.getListaLivro().add(escolhaPablo01);
        vendas.getListaLivro().add(escolhaPablo02);
        vendas.getListaLivro().add(escolhaPablo03);
        vendas.setVlDesconto(0.20);
        vendas.getVlTotalVenda(vendas);
        vendas.getFormapagamento().add(formaPagamento);
        vendas.getFormapagamento().add(formaPagamento02);
        System.out.println(vendas);
        System.out.println(enderecoPablo);
        System.gc();
    }
}
