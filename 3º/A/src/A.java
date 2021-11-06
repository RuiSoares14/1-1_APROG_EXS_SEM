import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, reprovados=0, total=0;
        
        n = sc.nextInt();
        
        int[] arr1 = new int [n];
        
        for (int i=0; i<n; i++){
            do{
                arr1 [i] = sc.nextInt();
            }while (arr1[i]>20 && arr1[i]<0);
            
            if (arr1[i]<10){
                reprovados++;
            }
            
            total += arr1[i];
        }
        
        System.out.printf("media=%.1f\n", (double) total/n);
        System.out.printf("reprovacoes=%d\n", reprovados);
    }
    
}
