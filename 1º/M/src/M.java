
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
public class M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero, n, primeiro=0, segundo=1, x;
        
        do {
        numero = sc.nextInt();
        } while (numero<0);
        
        if (numero!=0){
            System.out.println(primeiro);
        
            
        if (numero!=1){
            System.out.println(segundo);
        }
        }
        for (n=3; numero>=n; n++){
           x = primeiro + segundo;
           primeiro = segundo;
           segundo = x;
           System.out.println(segundo);
            
        }           
        
    }
    
}
