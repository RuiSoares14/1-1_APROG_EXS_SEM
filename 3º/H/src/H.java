
import java.util.Scanner;

public class H {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N;
        
        N = sc.nextInt();
        
        int array1[] = new int[N];
        
        array1 = preencher(array1);
        escrever(array1);
    }
    
    public static void escrever(int[] array1){
        boolean VF = true;
        String acao;
        
        while (VF==true){
            acao = sc.next();
            switch(acao){
                case "direita":
                    array1 = direita(array1);
                    for (int x=0; x<array1.length; x++){
                        System.out.printf("[%d]", array1[x]);
                    }
                    System.out.println();
                    break;
                case "esquerda":
                    array1 = esquerda(array1);
                    for (int x=0; x<array1.length; x++){
                        System.out.printf("[%d]", array1[x]);
                    }
                    System.out.println();
                    break;
                case "sair":
                    VF = false;
                    break;
            }
        }
    }
    
    public static int[] esquerda(int [] array1){
        int auxiliar;
        
        auxiliar = array1[0];
        
        for (int x=0; x<array1.length-1; x++){
            array1[x] = array1[x+1];
        }
        
        array1[array1.length-1] = auxiliar;
        
        return array1;
    }
    
    public static int[] direita(int [] array1){
        int auxiliar;
        
        auxiliar = array1[array1.length-1];
        
        for (int x=array1.length-2; x>=0; x--){
            array1[x+1] = array1[x];
        }
        
        array1[0] = auxiliar;
        
        return array1;
    }
    
    public static int[] preencher(int[] array1){
        
        for (int x=0; x<array1.length; x++){
            array1[x] = sc.nextInt();
        }
        
        return array1;
    } 
    
}
