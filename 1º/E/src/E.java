import java.util.Scanner;

public class E {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        int numero, alg, total = 0, n=0;
        
        numero = sc.nextInt();
        
        while (numero > 0) {
            while (numero != 0) {
                alg = numero % 10;
                total = (int) (total + (alg * Math.pow(8,n)));
                n++;
                numero = numero / 10;
            }
        
            System.out.println (total);
            total = 0;
            n = 0;
            numero = sc.nextInt();
        
        }
    }
    
}
