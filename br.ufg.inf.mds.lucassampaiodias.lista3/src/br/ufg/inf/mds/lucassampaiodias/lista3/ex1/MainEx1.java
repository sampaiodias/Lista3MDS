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
public class MainEx1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.plugar();
        lampada.interruptor();
        if (lampada.isLigada()){
            System.out.println("Lâmpada ligada!");
        }
        for (int repeticoes = 0; repeticoes < 58; repeticoes++){
            lampada.interruptor();
        }
        if (lampada.isLigada()){
            System.out.println("Lâmpada ligada!");
        }
        lampada.interruptor();
        if (lampada.isLigada()){
            System.out.println("Lâmpada ligada!");
        }
    }
}
