/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex4;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Produto {

    private String nome;
    private Caixa[] caixas;

    public Produto(String nomeDoProduto) {
        this.nome = nomeDoProduto;
        this.caixas = new Caixa[100];

        for (int numCaixas = 0; numCaixas < 100; numCaixas++) {
            caixas[numCaixas] = new Caixa();
        }
    }

    public Produto() {
        this.nome = "";
        this.caixas = new Caixa[100];

        for (int numCaixas = 0; numCaixas < 100; numCaixas++) {
            caixas[numCaixas] = new Caixa();
        }
    }

    public String balanco() {
        StringBuilder caixasDoProduto = new StringBuilder();
        int numCaixa = 0;
        caixasDoProduto.append("Produto: ");
        caixasDoProduto.append(this.nome);
        caixasDoProduto.append("\n");
        for (Caixa caixa : caixas) {
            if (caixa.getQtd() != 0) {
                caixasDoProduto.append("Caixa ");
                caixasDoProduto.append(numCaixa);
                caixasDoProduto.append(" possui ");
                caixasDoProduto.append(caixa.getQtd());
                caixasDoProduto.append(" unidades com valor ");
                caixasDoProduto.append(caixa.getValor());
                caixasDoProduto.append("\n");
            }
            numCaixa++;
        }
        return caixasDoProduto.toString();
    }

    public void addCaixa(int qtd, float valor, int numCaixa) {
        caixas[numCaixa] = new Caixa(qtd, valor);
    }

    public void removeCaixa(int numCaixa) {
        this.caixas[numCaixa] = null;
    }

    public int getQtd(int numCaixa) {
        return this.caixas[numCaixa].getQtd();
    }

    public float getValor(int numCaixa) {
        return this.caixas[numCaixa].getValor();
    }

    public void mudarQtd(int qtd, int numCaixa) {
        this.caixas[numCaixa].mudarQtd(qtd);
    }

    public void setValor(float valor, int numCaixa) {
        this.caixas[numCaixa].setValor(valor);
    }
}
