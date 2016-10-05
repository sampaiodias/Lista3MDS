/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex3;

/**
 *
 * @author lucas
 */
public class Jogo {
    private int[] valoresJog1;
    private int[] valoresJog2;
    Dado dado;
    
    public Jogo(){
        this.valoresJog1 = new int[3];
        this.valoresJog2 = new int[3];
        dado = new Dado();
    }
    
    private void jogarDadosJog1(){
        for (int arremecos = 0; arremecos < 3; arremecos++){
            this.dado.jogar();
            this.valoresJog1[arremecos] = this.dado.getValor();
        }
    }
    
    private void jogarDadosJog2(){
        for (int arremecos = 0; arremecos < 3; arremecos++){
            this.dado.jogar();
            this.valoresJog2[arremecos] = this.dado.getValor();
        }
    }
    
    public String getValoresJog1(){
        return this.valoresJog1[0] + " - " + 
                this.valoresJog1[1] + " - " + this.valoresJog1[2];
    }
    
    public String getValoresJog2(){
        return this.valoresJog2[0] + " - " + 
                this.valoresJog2[1] + " - " + this.valoresJog2[2];
    }
    
    public int getMaiorValor(){
        return 0;
    }
    
    public String getVencedor(){
        return "";
    }
}
