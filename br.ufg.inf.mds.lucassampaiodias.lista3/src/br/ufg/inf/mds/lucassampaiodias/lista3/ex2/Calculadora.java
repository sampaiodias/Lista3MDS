/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex2;

/**
 *
 * @author lucas
 */
public class Calculadora {

    private int valor1;
    private int valor2;

    public Calculadora(int x, int y) {
        this.valor1 = x;
        this.valor2 = y;
    }

    public int adicao() {
        return this.valor1 + this.valor2;
    }

    public int subtracao() {
        return this.valor1 - this.valor2;
    }

    public int multiplicacao() {
        return this.valor1 * this.valor2;
    }

    public int divisao() {
        return this.valor1 / this.valor2;
    }
}
