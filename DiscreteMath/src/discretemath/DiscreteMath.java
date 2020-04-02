/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class DiscreteMath {

    public static void main(String[] args) throws Exception {
        
        LerTXT lerTXT = new LerTXT();
        lerTXT.LeituraTXT();
//        System.out.println(Arrays.toString(lerTXT.conj1));
//        System.out.println(Arrays.toString(lerTXT.conj2));
        
        Metodos metodo = new Metodos();
        System.out.println(Arrays.toString(metodo.conj1));
        System.out.println(Arrays.toString(metodo.conj2));
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n============== Menu ===============");
            System.out.println("|     0 - Sair");
            System.out.println("|     1 - Percente/Não Pertence");
            System.out.println("|     2 - Contido/Não Contido");
            System.out.println("|     3 - Contido Propriamente");
            System.out.println("|     4 - União");
            System.out.println("|     5 - Interceção");
            System.out.println("|     6 - Diferença de Conjuntos");
            System.out.println("|     7 - Produto Cartesiano");
            System.out.println("|     8 - Conjunto das Partes");
            System.out.println("===================================\n");
            System.out.print("Selecione a Opção:");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Pertence: " + metodo.Pertence());
                    break;
                case 2:
                    System.out.println("Contido/Igual: " + metodo.ContidoIgual());
                    break;
                case 3:
                    System.out.println("Conj. 1 é Contido Propriamente no Conj. 2: " + metodo.ContidoPropriamente());
                    break;
                case 4:
                    System.out.println("União=" + metodo.União());
                    break;
                case 5:
                    System.out.println("Interceção=" + metodo.Intercecao());
                    break;
                case 6:
                    System.out.println("Diferença=" + metodo.DiferencaConjuntos());
                    break;
                case 7:
                    System.out.println(metodo.ProdutoCartesiano());
                    break;
                case 8:
                    System.out.println(metodo.ConjuntoPartes());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);

    }
}
