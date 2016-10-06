/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex4;

/**
 *
 * @author lucas
 */
public class Caixa {

    private int qtd;
    private float valor;

    public Caixa(int qtd, float valor) {
        this.qtd = qtd;
        this.valor = valor;
    }

    public Caixa() {
        this.qtd = 0;
        this.valor = 0;
    }

    public int getQtd() {
        return this.qtd;
    }

    public float getValor() {
        return this.valor;
    }

    public void mudarQtd(int qtd) {
        this.qtd += qtd;
    }

    public void setValor(float novoValor) {
        this.valor = novoValor;
    }
}
