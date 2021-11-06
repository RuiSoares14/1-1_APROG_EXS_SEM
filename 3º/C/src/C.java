
import java.util.Scanner;

public class C {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
               
        int n;
        boolean VF;
        
        do{
            n = sc.nextInt();
        }while(n<=0);
        
        int numeros [] = new int [n];
        
        numeros = preencherArray(numeros);
        
        VF = confirmarArray(numeros);
        
        if (VF==true){
            System.out.println("sempre crescente = true");
        }else{
            System.out.println("sempre crescente = false");
        }
    }
    
    
    
    
    
    public static int[] preencherArray(int[] numeros){
               
        for (int i=0; i<numeros.length; i++){
            numeros [i] = sc.nextInt();
        }
        
        return numeros;
    }
    
    
    
    public static boolean confirmarArray(int[] numeros){
        boolean VF;
        int x=0, y=0;
        
        for (int i=0; i<(numeros.length - 1); i++){
            if (numeros [i] < numeros[i+1]){
                x++;
            }
            y++;
        }
        
        if (x == y){
            VF = true;
        }else{
            VF = false;
        }
        
        return VF;
    }
}
