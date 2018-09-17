/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodecursos;

/**
 *
 * @author senai
 */
public class Mensalidade {
    
    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    private int numParcelas;
    private float valor;
    private String dataVencimento;
    private String dataPagamento;

    int numParcelas() {
        return numParcelas;
    }

    float valor() {
        return valor;
    }

    String dataVencimento() {
        return dataVencimento;
    }

    String dataPagamento() {
        return dataPagamento;
    }

}
