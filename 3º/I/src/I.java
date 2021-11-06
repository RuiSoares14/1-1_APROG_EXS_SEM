
import java.util.Scanner;

public class I {

    static Scanner sc = new Scanner(System.in);
    static int piso = 4, entrada = 3;
    
    public static void main(String[] args) {
        String array1 [][] = new String [piso][entrada];
        String nome;
        
        array1 = preencher(array1);
        nome = sc.nextLine();
        confirmar(array1, nome);
    }
    
    public static void confirmar(String[][] array1, String nome){
        int n=0;
        
        for (int x=0; x<entrada; x++){
            for (int y=piso-1; y>=0; y--){
                if (nome.equals(array1[y][x])){
                    System.out.println("nome="+array1[y][x]);
                    System.out.println("entrada="+x);
                    System.out.println("piso="+(piso-(y+1)));
                    n++;
                }
            }
        }
        
        if (n==0){
            System.out.println("Nao mora no predio");
        }
    }
    
    
    public static String[][] preencher(String[][] array1){
        
        for (int x=0; x<entrada; x++){
            for (int y=piso-1; y>=0; y--){
                array1[y][x] = sc.nextLine();
            }
        }
        
        return array1;
    }
    
}
