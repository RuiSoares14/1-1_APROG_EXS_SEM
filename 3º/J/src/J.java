
import java.util.Scanner;

public class J {
    
    static Scanner sc = new Scanner(System.in);
    public static String array1[] = new String [50];
    public static int array2[] = new int [50];
    public static int funcionarios = 0, top = 3;
    
    public static void main(String[] args) {
        int maior=0;
        
        maior = preencher(maior);
        if (maior>0){
            top3(maior);
        }
    }
    
    public static void top3(int maior){
        if(funcionarios>=3){
            ordenarPorNome();
            ordenarNumeros();
            ordenarSeNumeroIgual();
            for(int x=0; x<3; x++){
                System.out.printf("#%d:%s:%d\n", (x+1), array1[x], array2[x]);
            }
        }
        if(funcionarios==1){
            System.out.printf("#%d:%s:%d\n", (1), array1[0], array2[0]);
        }
        if(funcionarios==2){
            top=2;
            ordenarNumeros();
            ordenarSeNumeroIgual();
            for(int x=0; x<2; x++){
                System.out.printf("#%d:%s:%d\n", (x+1), array1[x], array2[x]);
            }
        }
    }
    
    public static void ordenarSeNumeroIgual(){
        double n;
        int auxiliar;  
        String auxiliar2;
        
        for (int x=0; x<top; x++){
            for(int y=0; y<top-1; y++){
                n = array1[y].compareTo(array1[y+1]);
                if (array2[y]==array2[y+1] && n>0){
                    auxiliar = array2[y];  
                    auxiliar2 = array1[y];
                    array2[y] = array2[y+1]; 
                    array1[y] = array1 [y+1];
                    array2[y+1] = auxiliar;  
                    array1[y+1] = auxiliar2; 
                }
            }
        }
    }
    
    
    public static void ordenarNumeros(){
        int auxiliar;  
        String auxiliar2;
        
        for(int x=0; x<funcionarios; x++){  
            for(int y=0; y<funcionarios-1; y++){  
                if(array2[y]< array2[y+1]){  
                    auxiliar = array2[y];  
                    auxiliar2 = array1[y];
                    array2[y] = array2[y+1]; 
                    array1[y] = array1 [y+1];
                    array2[y+1] = auxiliar;  
                    array1[y+1] = auxiliar2;                     
                }  
            }  
        }
    }
    
    public static void ordenarPorNome(){
        double n;
        int auxiliar;  
        String auxiliar2;
        
        for (int x=0; x<funcionarios; x++){
            for(int y=0; y<funcionarios-1; y++){
                n = array1[y].compareTo(array1[y+1]);
                if (n>0){
                    auxiliar = array2[y];  
                    auxiliar2 = array1[y];
                    array2[y] = array2[y+1]; 
                    array1[y] = array1 [y+1];
                    array2[y+1] = auxiliar;  
                    array1[y+1] = auxiliar2; 
                }
            }
        }
    }
    
    
    public static int preencher(int maior){
        String nome;
        int y=0, x=0, numero;
        boolean VF;
                
        nome = sc.nextLine();
        VF = nome.equals("FIM");
        
        while(VF==false){
            numero = sc.nextInt();
            if (numero>maior){
                maior = numero;
            }
            if (numero>=0){
                array1[x] = nome;
                array2[y] = numero;
                funcionarios++;
                x++;
                y++;
            }
            sc.nextLine();
            nome = sc.nextLine();
            VF = nome.equals("FIM");
        }
        
        return maior;
    }
    
}
