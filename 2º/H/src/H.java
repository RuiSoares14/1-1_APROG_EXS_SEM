
import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero, x;
        boolean cap = false;
        
        
        
        for (x=1; x<=5; x++){
            if (cap==false){
                numero = sc.nextInt();
                cap = capicua(numero);
            }
        }
        
        if (cap==true){
            System.out.println("capicua");
        }else{
            System.out.println("tentativas excedidas");
        }
        
    }
    
    
    
    public static boolean capicua(int n) {
        
        int x, capicua=0, alg;       
        
        x = n;
        
        while (x != 0){
            alg = x % 10;
            capicua = (alg + (capicua * 10));
            x = x / 10;
        }
        
        if (capicua == n){
            return true;
        } else {
            return false;
        }
    }
    
}
