
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pokem
 */
public class Y {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero, n, x=0, divisao;
        
        do {
        numero = sc.nextInt();
        }while(numero<=0);
               
        for (n=1; (numero/2)>=n; n++){
           divisao = numero%n;
           if (divisao == 0 && n%3==0){
                System.out.println(n);
                x++;        
           }
        }
        if (x==0){
            System.out.println("sem divisores multiplos de 3");
        }
    }
    
}
