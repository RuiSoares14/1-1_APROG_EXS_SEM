import java.util.Scanner;

public class H {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int numero, n=2;
        
        do {
            numero = sc.nextInt();
        } while (numero <= 0);
        
        
        while (n<Math.sqrt(numero) && numero%n!=0){
            n++;          
        }
        
        if (numero==1){
            System.out.println("nao e primo");
        }else{
            if (Math.sqrt(numero)>=n){
                System.out.println("nao e primo");
            }else{
                System.out.println("primo");
            }
        }
        
        
        
    }
    
}
