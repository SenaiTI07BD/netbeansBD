/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodecursos;

import java.sql.Date;

/**
 *
 * @author senai
 */
public class Mensalidade {
    
    private int numParcelas;
    private float valor;
    private Date dataVencimento;
    private Date dataPagamento;
    private int idMat;
    private int CurCodigo;
    
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public int getCurCodigo() {
        return CurCodigo;
    }

    public void setCurCodigo(int CurCodigo) {
        this.CurCodigo = CurCodigo;
    }
    

    int numParcelas() {
        return numParcelas;
    }

    float valor() {
        return valor;
    }

    Date dataVencimento() {
        return dataVencimento;
    }

    Date dataPagamento() {
        return dataPagamento;
    }

}
