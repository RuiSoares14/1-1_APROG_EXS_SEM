
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
public class Z {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero, alg, totalPares=0, totalImpares=0, totalAlg=0, maiorImpar=0;
        double percentagem;
        
        do{
            numero = sc.nextInt();
        }while (numero<=0);
        
        while (numero!=0){
            alg = numero%10;
            totalAlg++;
            
            if(alg%2==0){
                totalPares++;                
            } else {
                if (alg>maiorImpar){
                    maiorImpar=alg;
                }
            }
            numero = numero/10;
        }
        percentagem = ((double) totalPares / (double) totalAlg) * 100;
        
        System.out.printf("%.2f%%\n", percentagem);
        if (maiorImpar==0){
            System.out.println("nao ha algarismos impares");
        }else{
            System.out.println(maiorImpar);
        }
    }
    
}
