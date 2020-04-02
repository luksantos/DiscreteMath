/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import discretemath.LerTXT;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ConjuntoPartes {

    LerTXT lerTXT = new LerTXT();
    int conj1[] = LerTXT.conj1;
    int conj2[] = LerTXT.conj2;

    public String ConjutoPartesA() {
        String aux = null;
        int contador = 0;
        System.out.println("Conjunto das Partes de A:");
        for (int i = 0; i < conj1.length; i++) {
            aux = ("{" + conj1[i] + "}");
            System.out.print(aux);
        }
        if (conj1.length >= 2) {
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] != conj1[i]) {
                    aux = ("{" + conj1[contador] + "," + conj1[i] + "}");
                    System.out.print(aux);
                }
            }
            contador++;
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] != conj1[i] && i > contador) {
                    aux = ("{" + conj1[contador] + "," + conj1[i] + "}");
                    System.out.print(aux);
                }
            }
            contador++;
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] != conj1[i] && i > contador) {
                    aux = ("{" + conj1[contador] + "," + conj1[i] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj1.length >= 3) {
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }

            }
            contador++;
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[contador] + "," + conj1[2] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[1] + "," + conj1[2] + "," + conj1[3] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj1.length >= 4) {
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[2] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[1] + "," + conj1[2] + "," + conj1[3] + "," + conj1[4] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj1.length >= 5) {
            contador++;
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[2] + "," + conj1[3] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj1.length >= 6) {
            contador++;
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[2] + "," + conj1[3] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj1.length; i++) {
                if (conj1[contador] == conj1[i]) {
                    aux = ("{" + conj1[0] + "," + conj1[1] + "," + conj1[2] + "," + conj1[3] + "," + conj1[4] + "," + conj1[contador] + "}");
                    System.out.print(aux);
                }
            }
        }
        return "";
    }
    
        public String ConjutoPartesB() {
        String aux = null;
        int contador = 0;
        System.out.println("Conjunto das Partes de B:");
        for (int i = 0; i < conj2.length; i++) {
            aux = ("{" + conj2[i] + "}");
            System.out.print(aux);
        }
        if (conj2.length >= 3) {
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] != conj2[i]) {
                    aux = ("{" + conj2[contador] + "," + conj2[i] + "}");
                    System.out.print(aux);
                }
            }
            contador++;
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] != conj2[i] && i > contador) {
                    aux = ("{" + conj2[contador] + "," + conj2[i] + "}");
                    System.out.print(aux);
                }
            }
            contador++;
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] != conj2[i] && i > contador) {
                    aux = ("{" + conj2[contador] + "," + conj2[i] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj2.length >= 4) {
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }

            }
            contador++;
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[contador] + "," + conj2[2] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[1] + "," + conj2[2] + "," + conj2[3] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj2.length >= 5) {
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[2] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[1] + "," + conj2[2] + "," + conj2[3] + "," + conj2[4] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj2.length >= 6) {
            contador++;
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[2] + "," + conj2[3] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }
            }
        }
        if (conj2.length >= 6) {
            contador++;
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[2] + "," + conj2[3] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }
            }
            for (int i = 0; i < conj2.length; i++) {
                if (conj2[contador] == conj2[i]) {
                    aux = ("{" + conj2[0] + "," + conj2[1] + "," + conj2[2] + "," + conj2[3] + "," + conj2[4] + "," + conj2[contador] + "}");
                    System.out.print(aux);
                }
            }
        }
        return "";
    }
}
