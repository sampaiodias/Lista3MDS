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

    public Jogo() {
        this.valoresJog1 = new int[3];
        this.valoresJog2 = new int[3];
        dado = new Dado();
        jogarDadosJog1();
        jogarDadosJog2();
    }

    private void jogarDadosJog1() {
        for (int arremecos = 0; arremecos < 3; arremecos++) {
            this.dado.jogar();
            this.valoresJog1[arremecos] = this.dado.getValor();
        }
    }

    private void jogarDadosJog2() {
        for (int arremecos = 0; arremecos < 3; arremecos++) {
            this.dado.jogar();
            this.valoresJog2[arremecos] = this.dado.getValor();
        }
    }

    public String getValoresJog1() {
        return this.valoresJog1[0] + " - "
                + this.valoresJog1[1] + " - " + this.valoresJog1[2];
    }

    public String getValoresJog2() {
        return this.valoresJog2[0] + " - "
                + this.valoresJog2[1] + " - " + this.valoresJog2[2];
    }

    public int getMaiorValorJog1() {
        int maior = 0;
        for (int pos = 0; pos < 3; pos++) {
            if (this.valoresJog1[pos] > maior) {
                maior = this.valoresJog1[pos];
            }
        }
        return maior;
    }

    public int getMaiorValorJog2() {
        int maior = 0;
        for (int pos = 0; pos < 3; pos++) {
            if (this.valoresJog2[pos] > maior) {
                maior = this.valoresJog2[pos];
            }
        }
        return maior;
    }

    public String getVencedor() {
        int maiorJog1 = getMaiorValorJog1();
        int maiorJog2 = getMaiorValorJog2();
        if (maiorJog1 == maiorJog2) {
            return "EMPATE!";
        } else if (maiorJog1 > maiorJog2) {
            return "JOGADOR 1 VENCEU!";
        } else {
            return "JOGADOR 2 VENCEU!";
        }
    }
}
