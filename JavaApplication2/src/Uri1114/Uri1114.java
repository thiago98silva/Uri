/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1114;

import java.util.Scanner;

/**
 *
 * @author thiago98.silva
 */
public class Uri1114 {
    public static void run() {
        Password senha = new Password();
        
        boolean senhaCerta = false;
        while(!senhaCerta){
            Scanner input = new Scanner(System.in);
            int senhaDigitada = input.nextInt();
            senhaCerta = senha.verificaSenha(senhaDigitada);
        
        }
    }
}
