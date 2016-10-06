/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex1;

/**
 *
 * @author lucas
 */
public class Lampada {

    private boolean ligada;
    private boolean conectadaEnergizada;
    private int desgaste;

    public Lampada() {
        this.ligada = false;
        this.conectadaEnergizada = false;
        this.desgaste = 30;
    }

    public void interruptor() {
        if (this.conectadaEnergizada) {
            if (!this.ligada && this.desgaste > 0) {
                this.ligada = true;
                this.desgaste--;
            } else {
                this.ligada = false;
            }
        }
    }

    public void plugar() {
        this.conectadaEnergizada = true;
    }

    public void desplugar() {
        this.conectadaEnergizada = false;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public boolean isConectadaEnergizada() {
        return this.conectadaEnergizada;
    }
}
