import java.util.Scanner;

public class G {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numero, n, x, nDivisores=0;
        double divisao;
        
        numero = sc.nextInt();
        
        x = numero;
                
        for (n=1; (numero/2)>=n; n++){
           divisao = numero%n;
           if (divisao == 0){
               System.out.println(n);
               nDivisores++;
           }
        }
        
        nDivisores++;
        System.out.println(x);
        System.out.println("("+nDivisores+")");
        
       
    }
    
}
