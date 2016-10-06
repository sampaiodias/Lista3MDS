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
public class MainEx4 {

    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<Produto>();
        estoque.add(new Produto("Bola"));
        estoque.add(new Produto("Pipa"));
        estoque.add(new Produto("Carro"));
        estoque.remove(estoque.get(2));
        for (Produto item : estoque) {
            System.out.println(item.balanco());
        }
        System.out.println("******************");

        for (Produto item : estoque) {
            item.addCaixa(25, 1.5f, 1);
            item.addCaixa(5, 67.25f, 4);
        }
        for (Produto item : estoque) {
            System.out.println(item.balanco());
        }
        System.out.println("******************");

        estoque.get(0).mudarQtd(2, 4);
        estoque.get(1).mudarQtd(-2, 4);
        estoque.get(1).setValor(27, 1);

        for (Produto item : estoque) {
            System.out.println(item.balanco());
        }
        System.out.println("******************");
    }
}
