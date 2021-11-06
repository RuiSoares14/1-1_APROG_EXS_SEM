
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
public class N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero, numeroDois, x, alg, algConfirmar=10, nAlgMaiores=0, nAlg=0;
        
        numero = sc.nextInt();
        
        while (numero>=0){
            
            numeroDois = sc.nextInt();
            
            if (numero<numeroDois){
                x = numeroDois;
                
                while (x!=0){
                    alg = x%10;
                    
                    if (algConfirmar>alg){
                        algConfirmar = alg;
                        nAlgMaiores++;
                    }
                    
                    x=x/10;
                    nAlg++;
                }
                
                if (nAlg==nAlgMaiores){
                    System.out.println(numeroDois);
                }
                
                nAlgMaiores = 0;
                nAlg = 0; 
                
            }
            numero = numeroDois;
            algConfirmar = 10;
        }
    }
    
}
