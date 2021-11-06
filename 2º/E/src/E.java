
import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nPares, n1, n2, i, qDigitos, confirm=0, n11=0, n22=0, n=0;
        
        do{
            nPares = sc.nextInt();
        }while (nPares<0);
        
        for (i=1; nPares>=i; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            
            qDigitos = verificacao(n1, n2);
            
            if (qDigitos>=confirm && qDigitos!=0){
                n11 = n1;
                n22 = n2;
                n++;
            }       
        
        }
        
        if (n!=0){
            System.out.println(n11+"/"+n22);
        }else{
            System.out.println("sem resultados");
        }
        
    }
    
    
    public static int verificacao(int n1, int n2){
        int digitosIguais=0, digito1, digito2;
        
        while (n1!=0 || n2!=0){
            digito1 = n1 % 10;
            digito2 = n2 % 10;
            
            if(digito1==digito2){
                digitosIguais++;
            }
            
            n1 = n1/10;
            n2 = n2/10;
        }
        
        
        return digitosIguais;
    }
    
    
    
}
