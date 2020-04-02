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

    public String DiferencaConjuntos() {
        Scanner ler = new Scanner(System.in);
        int n, auxLeitura = 0;
        String option = null;

        do {
            System.out.println("\n==Verificar ==");
            System.out.println("|  1 = A - B");
            System.out.println("|  2 = B - A");
            System.out.print("Selecione a Opção:");
            auxLeitura = ler.nextInt();

            switch (auxLeitura) {
                case 1:
                    ArrayList<Integer> aux = new ArrayList();
                    int cont = 0,
                     cont1 = 0;
                    for (int i = 0; i < conj1.length; i++) {
                        if (conj2[cont1] == conj1[cont]) {
                            cont++;
                        } else {
                            aux.add(conj1[cont]);
                            cont++;
                            cont1++;
                        }
                    }
                    return option = aux.toString();
                case 2:
                    ArrayList<Integer> aux1 = new ArrayList();
                    int cont2 = 0,
                     cont3 = 0;
                    for (int i = 0; i < conj2.length; i++) {
                        if (conj1[cont2] == conj2[cont3]) {
                            cont3++;
                        } else {
                            aux1.add(conj2[cont3]);
                            cont2++;
                            cont3++;
                        }
                    }
                    return option = aux1.toString();
            }
        } while (auxLeitura != 0);
        return option;
    }

    public String ProdutoCartesiano() {
        Scanner ler = new Scanner(System.in);
        int n, auxLeitura = 0;
        do {
            System.out.println("\n== Produtos ==");
            System.out.println("|  1 = (AxB)");
            System.out.println("|  2 = (BxA)");
            System.out.print("Selecione a Opção:");
            auxLeitura = ler.nextInt();

            switch (auxLeitura) {
                case 1:
                    String aux = null;
                    System.out.println("Produto Cartesiano (AxB):");
                    for (int i = 0; i < conj1.length; i++) {
                        for (int j = 0; j < conj2.length; j++) {
                            aux = ("(" + conj1[i] + "," + conj2[j] + ")");
                            System.out.print(aux);
                        }
                    }
                    return "";
                case 2:
                    String aux1 = null;
                    System.out.println("Produto Cartesiano (BxA):");
                    for (int i = 0; i < conj2.length; i++) {
                        for (int j = 0; j < conj1.length; j++) {
                            aux1 = ("(" + conj2[i] + "," + conj1[j] + ")");
                            System.out.print(aux1);
                        }
                    }
                    return "";

            }
        } while (auxLeitura != 0);
        return "";
    }

    public String ConjuntoPartes() {
        ConjuntoPartes conjPart = new ConjuntoPartes();
        Scanner ler = new Scanner(System.in);
        int n, auxLeitura = 0;
        do {
            System.out.println("\n== Conj. das Partes ==");
            System.out.println("|  1 = A");
            System.out.println("|  2 = B");
            System.out.print("Selecione a Opção:");
            auxLeitura = ler.nextInt();

            switch (auxLeitura) {
                case 1:
                    conjPart.ConjutoPartesA();
                    return "";
                case 2:
                    conjPart.ConjutoPartesB();
                    return "";
            }
        } while (auxLeitura != 0);
        return "";
    }

}
