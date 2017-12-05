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
public class CrabRace {
    public int[] cadastrarCarangueijos(int quantidade){
        int i;
        int[] carangueijos = new int[quantidade];
         Scanner input = new Scanner(System.in);    
        for(i=0;i<quantidade;i++){
            System.out.println("Digite a velocidadeda carangueijo "+ (i+1) + ":");
            carangueijos[i]= input.nextInt();
        }
        return carangueijos;
    }
    
    public int verificarVelocidades(int[] carangueijos){
        int velocidade=0,i;
        for(i=0;i<carangueijos.length;i++){
            if(carangueijos[i]>velocidade){
                velocidade=carangueijos[i];
            }
        }
        
        return getRank(velocidade);
    }
    
    public int getRank(int velocidade){
        if (velocidade<10){
            return 1;
        }else if(velocidade>=10&&velocidade<20){
            return 2;
        }else{
            return 3;
        }
    }
}
