/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.lista3.ex2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class MainEx2 {

    public static void main(String[] args) {
        int x;
        int y;
        int opcao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        x = Integer.parseInt(leitor.nextLine());
        System.out.println("Insira o segundo valor: ");
        y = Integer.parseInt(leitor.nextLine());
        System.out.println("");

        Calculadora calc = new Calculadora(x, y);

        System.out.println("Insira 1, 2, 3 ou 4 para: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao = Integer.parseInt(leitor.nextLine());
        System.out.println("");

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + calc.adicao());
                break;
            case 2:
                System.out.println("Resultado: " + calc.subtracao());
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicacao());
                break;
            case 4:
                System.out.println("Resultado: " + calc.divisao());
                break;
        }
    }
}
