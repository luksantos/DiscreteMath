/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.io.*;
import java.util.*;

/**
 *
 * @author lucas
 */
public class DiscreteMath {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("sets.txt"));
        String txt;
        while ((txt = br.readLine()) != null) {
            System.out.println("\n" + txt);
            String[] conjunto = txt.split("[ABCD=,{ }]");
            for (String item : conjunto) {
                System.out.println(item);
            }
        }
        
        Conjunto conj = new Conjunto();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n\n### Menu ###");
            System.out.println("\n===============================");
            System.out.println("|     0 - Sair");
            System.out.println("|     1 - Percente/Não Pertence");
            System.out.println("|     2 - Contido/Igual");
            System.out.println("|     3 - União");
            System.out.println("=================================\n");
            
            System.out.print("Selecione a Opção:");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Pertence: " + conj.Pertence());
                    break;
                case 2:
                    System.out.println("Contido/Igual: " + conj.ContidoIgual());
                    break;
                case 3: 
                    System.out.println("União: AUX=" + conj.União());
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
