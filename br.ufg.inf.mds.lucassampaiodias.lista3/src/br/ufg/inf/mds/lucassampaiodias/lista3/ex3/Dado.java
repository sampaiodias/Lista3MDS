/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex3;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Dado {

    private int valor;

    public Dado() {
        this.valor = 1;
    }

    public void jogar() {
        Random random = new Random();
        this.valor = random.nextInt(6) + 1;
    }

    public int getValor() {
        return this.valor;
    }
}
