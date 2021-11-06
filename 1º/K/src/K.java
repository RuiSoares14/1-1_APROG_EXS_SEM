
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno DEI
 */
public class K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
               
        int numero, n, x=2;       
     
        do {
        numero = sc.nextInt();
        } while (numero <= 0);
        
        for (n=2; numero >= n; n++){
            
            while (x<(Math.sqrt(n)) && n%x!=0){
                x++;          
            }
        
        if ((Math.sqrt(n))<x){
            System.out.println(n);
        }
        x=2;
        }

    }
    
}
