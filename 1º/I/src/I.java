import java.util.Scanner;

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numeroUm, numeroDois, x, y, resto;
        
        do {
            numeroUm = sc.nextInt();    
        } while (numeroUm <=0);
        
        do {
            numeroDois = sc.nextInt();    
        } while (numeroDois <=0);
        
        x = numeroUm;
        y = numeroDois;
        
        do {
            resto = x % y;
            
            x = y;
            y = resto;
            
            
        }while (resto != 0);
        
        System.out.println((numeroUm * numeroDois)/ x);
    }
    
}
