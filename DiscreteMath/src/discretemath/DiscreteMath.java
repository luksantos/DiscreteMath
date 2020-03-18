/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.io.*;

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
            String conjunto[] = txt.split(", ");
            for (String item : conjunto) {
                System.out.println(item);
            }
        }
    }
}
