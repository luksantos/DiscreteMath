/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacoesTres;

/**
 *
 * @author lucas
 */
public class OperacoesTres {
    
    relacoesTres.LerTXT_Tres lerTXT = new relacoesTres.LerTXT_Tres();
    int conj1[] = relacoesTres.LerTXT_Tres.conj1;
    int conj2[] = relacoesTres.LerTXT_Tres.conj2;
    int conj3[] = relacoesTres.LerTXT_Tres.conj3;
    
    public String MenorQue() {
        int i = 0;
        System.out.print("{");
        while (i < conj1.length) {
            int j = 0, k = 0;
            while (j < conj2.length) {
                if (conj1[i] < conj2[j]) {
                    System.out.print("<" + conj1[i] + "," + conj2[j] + ">");
                    j++;
                } else {
                    j++;
                }
            }
            while (k < conj3.length) {
                if (conj1[i] < conj3[k]) {
                    System.out.print("<" + conj1[i] + "," + conj3[k] + ">");
                    k++;
                } else {
                    k++;
                }
            }
            i++;
        }
        System.out.print("}");
        return "";
    }
    public String MaiorQue() {
        int i = 0;
        System.out.print("{");
        while (i < conj1.length) {
            int j = 0, k = 0;
            while (j < conj2.length) {
                if (conj1[i] > conj2[j]) {
                    System.out.print("<" + conj1[i] + "," + conj2[j] + ">");
                    j++;
                } else {
                    j++;
                }
            }
            while (k < conj3.length) {
                if (conj1[i] > conj3[k]) {
                    System.out.print("<" + conj1[i] + "," + conj3[k] + ">");
                    k++;
                } else {
                    k++;
                }
            }
            i++;
        }
        System.out.print("}");
        return "";
    }
    public String IgualA() {
        int i = 0;
        System.out.print("{");
        while (i < conj1.length) {
            int j = 0, k = 0;
            while (j < conj2.length) {
                if (conj1[i] == conj2[j]) {
                    System.out.print("<" + conj1[i] + "," + conj2[j] + ">");
                    j++;
                } else {
                    j++;
                }
            }
            while (k < conj3.length) {
                if (conj1[i] == conj3[k]) {
                    System.out.print("<" + conj1[i] + "," + conj3[k] + ">");
                    k++;
                } else {
                    k++;
                }
            }
            i++;
        }
        System.out.print("}");
        return "";
    }
    public String SerQuadradoDe() {
        int i = 0;
        System.out.print("{");
        while (i < conj1.length) {
            int j = 0, k = 0;
            while (j < conj2.length) {
                if (conj1[i] == conj2[j]*conj2[j]) {
                    System.out.print("<" + conj1[i] + "," + conj2[j] + ">");
                    j++;
                } else {
                    j++;
                }
            }
            while (k < conj3.length) {
                if (conj1[i] == conj3[k]*conj3[k]) {
                    System.out.print("<" + conj1[i] + "," + conj3[k] + ">");
                    k++;
                } else {
                    k++;
                }
            }
            i++;
        }
        System.out.print("}");
        return "";
    }
    public String SerRaizDe() {
        int i = 0;
        System.out.print("{");
        while (i < conj1.length) {
            int j = 0, k = 0;
            while (j < conj2.length) {
                if (conj1[i]*conj1[i] == conj2[j]) {
                    System.out.print("<" + conj1[i] + "," + conj2[j] + ">");
                    j++;
                } else {
                    j++;
                }
            }
            while (k < conj3.length) {
                if (conj1[i]*conj1[i] == conj3[k]) {
                    System.out.print("<" + conj1[i] + "," + conj3[k] + ">");
                    k++;
                } else {
                    k++;
                }
            }
            i++;
        }
        System.out.print("}");
        return "";
    }
}
