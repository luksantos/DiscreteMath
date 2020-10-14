/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacoes;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Operacoes {

    relacoes.LerTXT lerTXT = new relacoes.LerTXT();
    int conj1[] = relacoes.LerTXT.conj1;
    int conj2[] = relacoes.LerTXT.conj2;

    public String MenorQue() {
        int aux = 0;
        System.out.print("{");
        while (aux < conj1.length) {
            int auxDois = 0;
            while (auxDois < conj2.length) {
                if (conj1[aux] < conj2[auxDois]) {
                    System.out.print("<" + conj1[aux] + "," + conj2[auxDois] + ">");
                    auxDois++;
                } else {
                    auxDois++;
                }
            }
            aux++;
        }
        System.out.print("}");
        return "";
    }
    public String MaiorQue() {
        int aux = 0;
        System.out.print("{");
        while (aux < conj1.length) {
            int auxDois = 0;
            while (auxDois < conj2.length) {
                if (conj1[aux] > conj2[auxDois]) {
                    System.out.print("<" + conj1[aux] + "," + conj2[auxDois] + ">");
                    auxDois++;
                } else {
                    auxDois++;
                }
            }
            aux++;
        }
        System.out.print("}");
        return "";
    }
    public String IgualA() {
        int aux = 0;
        System.out.print("{");
        while (aux < conj1.length) {
            int auxDois = 0;
            while (auxDois < conj2.length) {
                if (conj1[aux] == conj2[auxDois]) {
                    System.out.print("<" + conj1[aux] + "," + conj2[auxDois] + ">");
                    auxDois++;
                } else {
                    auxDois++;
                }
            }
            aux++;
        }
        System.out.print("}");
        return "";
    }
    public String SerQuadradoDe() {
        int aux = 0;
        System.out.print("{");
        while (aux < conj1.length) {
            int auxDois = 0;
            while (auxDois < conj2.length) {
                if (conj1[aux] == conj2[auxDois]*conj2[auxDois]) {
                    System.out.print("<" + conj1[aux] + "," + conj2[auxDois] + ">");
                    auxDois++;
                } else {
                    auxDois++;
                }
            }
            aux++;
        }
        System.out.print("}");
        return "";
    }
    public String SerRaizDe() {
        int aux = 0;
        System.out.print("{");
        while (aux < conj1.length) {
            int auxDois = 0;
            while (auxDois < conj2.length) {
                if (conj1[aux]*conj1[aux] == conj2[auxDois]) {
                    System.out.print("<" + conj1[aux] + "," + conj2[auxDois] + ">");
                    auxDois++;
                } else {
                    auxDois++;
                }
            }
            aux++;
        }
        System.out.print("}");
        return "";
    }
}
