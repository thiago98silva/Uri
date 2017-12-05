/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import java.util.Scanner;

/**
 *
 * @author thiago98.silva
 */
public class Uri1142 {
    public static void run() {
        SequenceGenerator pum = new SequenceGenerator();
    
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        System.out.println(pum.gerarSequencia(numero));
    }    
}
