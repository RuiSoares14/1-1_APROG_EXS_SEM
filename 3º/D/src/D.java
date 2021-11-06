
import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int array1 [][] = new int [21][2], alunos;
        
        do{
            alunos = sc.nextInt();
        }while (alunos<0);
        
        int arraynotas [] = new int [alunos];
        
        array1 = preencher(array1);
        arraynotas = notas(arraynotas);
        array1 = fim(array1, arraynotas);
        escrever(array1);
    }
    
    
    public static void escrever(int[][] array1){
        for (int w=0; w<array1.length; w++){
            System.out.println(array1[w][0]+" "+array1[w][1]);
        }
    }
    
    
    
    
    public static int[][] fim(int[][] array1, int[] arraynotas){
        for (int z=0; z<arraynotas.length; z++){
            int n = arraynotas[z];
            array1[n][1]++;
        }
        return array1;
    }    
    
    
    
    
    public static int[] notas(int[] arraynotas){
        for (int y=0; y < arraynotas.length; y++){
            arraynotas [y] = sc.nextInt();
        }
        return arraynotas;
    }
    
    
    
    
    
    public static int[][] preencher(int[][] array1){
        int n=0;
        
        for (int x=0; x<=20; x++){
            array1[x][0] = n;
            n++;
        }
        
        return array1;
    }
}
