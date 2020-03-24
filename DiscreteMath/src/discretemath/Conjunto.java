/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretemath;

import java.util.*;

/**
 *
 * @author lucas
 */
public class Conjunto {

    ArrayList<Integer> conj1 = new ArrayList();
    Scanner ler = new Scanner(System.in);

    public Conjunto() {
        conj1.add(3);
        conj1.add(4);
        conj1.add(-1);
        conj1.add(5);
    }

    public boolean pertence() {
        boolean option = false;
        for (Integer c : conj1) {
            int n;
            System.out.printf("Insira um Número:\n");
            n = ler.nextInt();
            if (conj1.contains(n)) {
                option = true;
                break;
            } else {
                option = false;
                break;
            }
        }
        return option;
    }

}
