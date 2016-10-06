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
public class MainEx3 {

    public static void main(String[] args) {
        Jogo partida = new Jogo();

        System.out.println("JOGO DE DADOS");
        System.out.println("Jogador 1: " + partida.getValoresJog1());
        System.out.println("Jogador 2: " + partida.getValoresJog2());

        System.out.println(partida.getVencedor());
    }
}
