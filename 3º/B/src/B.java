
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros, i=0, n=0, menor, vezesMenor=0;
        int [] arr1 = new int [20];
        
        numeros = sc.nextInt();
        
        while (numeros>=0){
            arr1 [i] = numeros;
            i++;
            numeros = sc.nextInt();
            n++;
        }
        
        menor = arr1 [0];
        
        for (int x=1; x<n; x++){
            if (arr1[x]<menor){
                menor = arr1[x];
            }
        }
        
        for (int y=0; y<n; y++){
            if (arr1[y]==menor){
                vezesMenor++;
            }
        }
        
        if (n!=0){
            System.out.printf("menor=%d\n", menor);
            System.out.printf("ocorrencias=%d\n", vezesMenor);   
        }
    }
    
}
