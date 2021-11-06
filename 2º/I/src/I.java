
import java.util.Scanner;


public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero;
        
        do {
            numero = sc.nextInt();
        } while (numero<0);
        
        fibo(numero);
    }
    
    
    public static void fibo(int n) {
       
        int numero, primeiro=0, segundo=1, x = 0;
        boolean cf=false;
               
        if (n==0){
            cf = true;
        }
            
        if (n==1){
            cf = true;
        }
        
        for (numero=1; n>=numero; numero++){
            x = primeiro + segundo;
            primeiro = segundo;
            segundo = x;  
            if (x==n){
                cf = true;
            }
        }
        
        if (cf==true){
            System.out.println("e de Fibonacci");
        } else {
            System.out.println("nao e de Fibonacci");
        }
    } 
}    

