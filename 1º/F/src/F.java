import java.util.Scanner;

public class F {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        int numero, x, capicua=0, alg;
        
        numero = sc.nextInt();
        
        x = numero;
        
        while (x != 0){
            alg = x % 10;
            capicua = (alg + (capicua * 10));
            x = x / 10;
        }
        
        if (capicua == numero){
            System.out.println ("capicua");
        } else {
            System.out.println ("nao capicua");
        }
    }
    
}
