
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero, alg, total=0;
        
        numero = sc.nextInt ();
        
        while (numero>0){
            while (numero!=0) {
                alg=numero%10;
                if (alg%2==0){
                    total = total + alg;
                }
                numero=numero/10;               
                
            }
            System.out.println (total);
            total = 0;
            numero = sc.nextInt();    
    }
    
}
}