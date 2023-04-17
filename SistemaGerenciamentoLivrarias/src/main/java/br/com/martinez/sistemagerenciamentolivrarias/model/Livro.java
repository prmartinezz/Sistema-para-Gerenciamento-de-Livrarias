package br.com.martinez.sistemagerenciamentolivrarias.model;

public class Livro {

    public Livro(String editora, String autor, String genero, int anoLancamento, int qtdEstoque, int preco, int numPagina, double vlrVenda) {
        this.editora = editora;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
        this.numPagina = numPagina;
        this.qtdVendida = qtdVendida;
        this.vlrVenda = vlrVenda;
    }
    
    public Livro() {
    }

    private String editora;
    private String autor;
    private String genero;
    private int anoLancamento;
    private int qtdEstoque;
    private int preco;
    private int numPagina;
    private int qtdVendida;
    private double vlrVenda;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    @Override
    public String toString() {
        return "Livro{" + "editora=" + editora + ", autor=" + autor + ", genero=" + genero + ", anoLancamento=" + anoLancamento + ", qtdEstoque=" + qtdEstoque + ", preco=" + preco + ", numPagina=" + numPagina + ", qtdVendida=" + qtdVendida + ", vlrVenda=" + vlrVenda + '}';
    }
}
