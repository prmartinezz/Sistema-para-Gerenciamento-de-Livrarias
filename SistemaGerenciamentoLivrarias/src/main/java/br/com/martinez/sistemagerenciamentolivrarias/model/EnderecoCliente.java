package br.com.martinez.sistemagerenciamentolivrarias.model;

public class EnderecoCliente {

    public EnderecoCliente(String rua, int numero, String bairro, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
    }
    
    public EnderecoCliente() {
    }

    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String pais;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" + "rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", estado=" + estado + ", pais=" + pais + '}';
    }
}
