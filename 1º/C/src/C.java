import java.util.Scanner;

public class C {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner (System.in);
        
        int numero, alg, total=1, nImpar=0;
        
        do {
            numero = sc.nextInt();
        } while (numero < 0);
        
        while (numero != 0){
            alg = numero % 10;
            
            if (alg % 2 != 0) {
                total = total * alg;
                nImpar++; 
            }
            
            numero = numero / 10;
        }
        if (nImpar>0) {
            System.out.println (total);
        } else {
            System.out.println ("nao ha algarismos impares");
        }
    }
    
}
