import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numero, alg, par, total=0;
        
        do {
            numero = sc.nextInt ();
        } while (numero<=0);
        
        while (numero!=0) {
            
            alg = numero%10;
            par = alg%2;
            numero = numero/10;
            
            if (par==0){
                total = total + alg;
            }
        }
        
        System.out.println (total); 
            
    }
        
    }
    

