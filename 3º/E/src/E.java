import java.util.Scanner;

public class E {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        String array1[] = new String [20];
        double array2[] = new double [20];
        int funcionarios=0;
        
        funcionarios = preencher(array1, array2, funcionarios);
        media = doMedia(array2, funcionarios);
        escrever(array1, media, funcionarios,array2);
    }
    
    public static void escrever(String[] array1,double media, int funcionarios, double[] array2){
        if (media!=0){
            System.out.printf("%.1f\n", media);
        }
        
        for (int x=0; x<funcionarios; x++){
            if (array2[x]<(double) media){
                System.out.println(array1[x]);
            }
        }
    }
    
    public static double doMedia(double[] array2, int funcionarios){
        double media=0;
        double total=0, quantidade=0;
        
        for (int x=0; x<funcionarios; x++){
            total += array2[x];
            quantidade++;
        }
        if (quantidade!=0){
            media = (double)total/quantidade;
        }
        
        return media;
    }
    
    public static int preencher(String[] array1, double[] array2, int funcionarios){
        Scanner sc = new Scanner(System.in);
        String nome;
        int y=0, x=0;
        boolean VF=false;
        double numero;
                
        nome = sc.next();
        VF = nome.equals("fim");
        
        while(VF==false){
            array1[x] = nome;
            numero = sc.nextDouble();
            array2[y] = numero;
            nome = sc.next();
            funcionarios++;
            x++;
            y++;
            VF = nome.equals("fim");
            return funcionarios;
        }
        
        return funcionarios;
    }
        
}
