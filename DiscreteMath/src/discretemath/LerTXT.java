/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author lucas
 */
public class LerTXT {

    static int[] conj1 = new int[100];
    static int[] conj2 = new int[100];

    public static void LeituraTXT() throws FileNotFoundException, IOException {
        ArrayList<String> conjunto1 = new ArrayList<>();
        ArrayList<String> conjunto2 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("sets.txt"));
        String txt;
        while ((txt = br.readLine()) != null) {
            System.out.println("\n" + txt);
            if (Character.isLetter(txt.charAt(0))) {
                String parte1 = txt.substring(txt.indexOf("{") + 1, txt.indexOf("}"));
                String parte2[] = parte1.split(Pattern.quote(", "));
                for (String item : parte2) {
                    //System.out.print(item);
                    conjunto1.add(item);
                }
                String parte3 = txt.substring(txt.lastIndexOf("{") + 1, txt.lastIndexOf("}"));
                String parte4[] = parte3.split(Pattern.quote(", "));
                for (String item : parte4) {
                    //System.out.print(item);
                    conjunto2.add(item);
                }
            } else {
                System.out.println("TXT Mal Formatado");
            }
        }

        String[] conjAux1 = conjunto1.toArray(new String[conjunto1.size()]);
        int[] aux1 = new int[conjAux1.length];
        for (int i = 0; i < conjAux1.length; i++) {
            aux1[i] = Integer.parseInt(conjAux1[i]);
        }

        String[] conjAux2 = conjunto2.toArray(new String[conjunto2.size()]);
        int[] aux2 = new int[conjAux2.length];
        for (int i = 0; i < conjAux2.length; i++) {
            aux2[i] = Integer.parseInt(conjAux2[i]);
        }
        
        conj1 = aux1;
        conj2 = aux2;
    }
}
