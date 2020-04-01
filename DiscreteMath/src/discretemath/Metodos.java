/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.util.*;
import discretemath.LerTXT;

/**
 *
 * @author lucas
 */
public class Metodos {
    
    LerTXT lerTXT = new LerTXT();
    int conj1[] = LerTXT.conj1;
    int conj2[] = LerTXT.conj2;
    //int conj2[] = {4, 3, 5, -1};
    Scanner ler = new Scanner(System.in);

    public boolean Pertence() {
        Scanner ler = new Scanner(System.in);
        int aux = 0;
        boolean option = false;
        do {
            System.out.println("\n==Verificar ==");
            System.out.println("|  1 - Conj. 1");
            System.out.println("|  2 - Conj. 2");
            System.out.print("Selecione a Opção:");
            aux = ler.nextInt();

            switch (aux) {
                case 1:
                    int i,
                     n;
                    System.out.printf("Insira um Número:\n");
                    n = ler.nextInt();
                    for (i = 0; i < conj1.length;) {
                        if (n == conj1[i]) {
                            option = true;
                            break;
                        } else {
                            option = false;
                            i++;
                        }
                    }
                    return option;
                case 2:
                    int j;
                    System.out.printf("Insira um Número:\n");
                    n = ler.nextInt();
                    for (j = 0; j < conj2.length;) {
                        if (n == conj2[j]) {
                            option = true;
                            break;
                        } else {
                            option = false;
                            j++;
                        }
                    }
                    return option;
            }
        } while (aux != 0);
        return option;
    }

    public boolean ContidoIgual() {
        boolean c = false;
        ArrayList<Integer> aux = new ArrayList();
        int i, j;
        for (i = 0; i < conj1.length; i++) {
            for (j = 0; j < conj2.length;) {
                if (conj1[i] != conj2[j]) {
                    j++;
                } else {
                    aux.add(conj1[i]);
                    break;
                }
            }
        }
        if (conj2.length == aux.size()) {
            c = true;
        }
        return c;
    }

    public boolean ContidoPropriamente() {
        boolean c = false;
        ArrayList<Integer> aux = new ArrayList();
        int i, j;
        for (i = 0; i < conj1.length; i++) {
            for (j = 0; j < conj2.length;) {
                if (conj1[i] != conj2[j]) {
                    j++;
                } else {
                    aux.add(conj1[i]);
                    break;
                }
            }
        }
        if (conj2.length > aux.size()) {
            c = true;
        }
        return c;
    }

    public String União() {
        String valores;
        Set<Integer> conjAux = new HashSet<>();
        int i, j;
        for (i = 0; i < conj1.length; i++) {
            for (j = 0; j < conj2.length; j++) {
                conjAux.add(conj2[j]);
            }
            conjAux.add(conj1[i]);
        }
        valores = conjAux.toString();
        return valores;
    }

    public String Intercecao() {
        ArrayList<Integer> aux = new ArrayList();
        int i, j;
        for (i = 0; i < conj1.length; i++) {
            for (j = 0; j < conj2.length;) {
                if (conj1[i] != conj2[j]) {
                    j++;
                } else {
                    aux.add(conj1[i]);
                    break;
                }
            }
        }
        return aux.toString();
    }

}
