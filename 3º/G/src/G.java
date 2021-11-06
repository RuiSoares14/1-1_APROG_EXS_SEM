
import java.util.Scanner;

public class G {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        int array1 [] = new int [N];
        
        
        array1 = preencher(array1);
        escrever(array1);
    }
    
    public static void escrever(int[] array1){
        for (int x=(array1.length-1); x>=0; x--){
            System.out.println(array1[x]);
        }
    }
    
    
    public static int[] preencher(int[] array1){
                
        for (int x=0; x<array1.length; x++){
            array1[x] = sc.nextInt();
        }
        
        return array1;
    }
    
}
