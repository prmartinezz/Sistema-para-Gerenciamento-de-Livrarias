package br.com.martinez.sistemagerenciamentolivrarias.model;

import java.util.ArrayList;

public class Vendas {
    
    public Vendas() {
        this.listaLivro = new ArrayList<>();
        this.formapagamento = new ArrayList<>();
    }

    public Vendas(CadastroCliente cliente, double vlDesconto) {
        this.cliente = cliente;
        this.vlDesconto = vlDesconto;
    }
    
    private CadastroCliente cliente;
    private ArrayList<Livro> listaLivro;
    private double vlDesconto;
    private double vlTotalVenda;
    private int qtdVendida;
    private ArrayList<FormaPagamento> formapagamento;
    
    public void getVlTotalVenda(Vendas vendas) {
        for(int i = 0; i < listaLivro.size(); i++) {
            vlTotalVenda += listaLivro.get(i).getVlrVenda();
    }
        vlTotalVenda = vlTotalVenda - (vlTotalVenda - vendas.vlDesconto) * qtdVendida;
    }        

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlTotalVenda() {
        return vlTotalVenda;
    }

    public void setVlTotalVenda(double vlTotalVenda) {
        this.vlTotalVenda = vlTotalVenda;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public ArrayList<FormaPagamento> getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(ArrayList<FormaPagamento> formapagamento) {
        this.formapagamento = formapagamento;
    }
    
    public void finalizado() {
        System.out.println("Venda realizada com sucesso.");
    }

    @Override
    public String toString() {
        return "Vendas{" + "cliente=" + cliente + ", listaLivro=" + listaLivro + ", vlDesconto=" + vlDesconto + ", vlTotalVenda=" + vlTotalVenda + ", qtdVendida=" + qtdVendida + ", formapagamento=" + formapagamento + '}';
    }

    
}
