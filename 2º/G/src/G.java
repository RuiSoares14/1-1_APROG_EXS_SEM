
import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N, i;
        boolean armstrong;
        
        N = sc.nextInt();
        
        if (N>0){
            for(i=0; i<=N; i++){
                armstrong = confirm(i);
                
                if (armstrong==true){
                    System.out.println(i);
                }
            }
        }
    }
    
    
    public static boolean confirm(int i){
        boolean armst;
        int confirmar, alg, n=0, total=0;
        
        confirmar = i;
        
        n = numeroAlg(i);               
        
        while (i!=0){            
            alg = i%10;
            total = total + (int) Math.pow(alg, n);
            i = i/10;
        }
        
        if(total == confirmar){
            armst = true;
        }else{
            armst = false;
        }
                
        return armst;
    }
    
    
    
    public static int numeroAlg(int i){
        int n=0;
        while (i!=0){
            n++;
            i = i/10;
        }
        return n;
    }
    
}
