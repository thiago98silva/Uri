/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1789;

import java.util.Scanner;

/**
 *
 * @author thiago98.silva
 */
public class Uri1789 {
    public static void run() {
        int quantidade=0, veloz;
        Scanner input = new Scanner(System.in);
        CrabRace corridaCarangueijos = new CrabRace();
        System.out.println("Digite o número de Carangueijos nesse grupo:");
        quantidade = input.nextInt();
        int[] carangueijos = new int[quantidade];
        carangueijos = corridaCarangueijos.cadastrarCarangueijos(quantidade);
        
        System.out.println("A carangueijos mais veloz do grupo é nível: " + corridaCarangueijos.verificarVelocidades(carangueijos));
    }
}
