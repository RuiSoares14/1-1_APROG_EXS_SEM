
import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero, x, n, vezes=0;
        boolean acertou;
        
        do{
            numero = sc.nextInt();
        }while (numero>100 && 0>numero);
        
        for (n=1; n<=30; n++){
            System.out.println();
        }
        
        do {
            x = sc.nextInt();
            acertou = tentativas(numero, x);
            vezes++;
        }while (acertou==false);
        
        System.out.println(vezes);
    }
    
    
    public static boolean tentativas(int n1, int n2){
        if (n1 < n2){
            System.out.println("Tente menor");
            return false;
        }else{
            if (n1 > n2){
                System.out.println("Tente maior");
                return false;
            }else{
                System.out.println("Acertou");
                return true;
            }
        }
    }
    
}
