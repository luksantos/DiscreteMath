/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacoesTres;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class RelacoesTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        relacoesTres.LerTXT_Tres lerTXT_Tres = new relacoesTres.LerTXT_Tres();
        lerTXT_Tres.LeituraTXT();
        lerTXT_Tres.PreparaTerceiro();

        OperacoesTres operacoes = new OperacoesTres();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n============== Menu ===============");
            System.out.println("|     0 - Sair");
            System.out.println("|     1 - Menor Que");
            System.out.println("|     2 - Maior Que");
            System.out.println("|     3 - Igual A");
            System.out.println("|     4 - Quadrado De");
            System.out.println("|     5 - Raiz De");
            System.out.println("===================================\n");
            System.out.print("Selecione a Opção:");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Menor Que: ");
                    System.out.print(operacoes.MenorQue());
                    break;
                case 2:
                    System.out.print("Maior Que: ");
                    System.out.print(operacoes.MaiorQue());
                    break;
                case 3:
                    System.out.print("Igual A: ");
                    System.out.print(operacoes.IgualA());
                    break;
                case 4:
                    System.out.print("Quadrado De: ");
                    System.out.print(operacoes.SerQuadradoDe());
                    break;
                case 5:
                    System.out.print("Raiz De: ");
                    System.out.print(operacoes.SerRaizDe());
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
