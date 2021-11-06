import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        
        m = sc.nextInt();
        n = sc.nextInt();

        if (m>=n && m!=0 && n!=0){
            System.out.println("C("+m+","+n+")="+combinacoes(m,n));
            System.out.println("P("+m+","+n+")="+permutacoes(m,n));
        }
    }
 
    public static int combinacoes(int m, int n){
        int valor1, diferenca;
        
        diferenca = m - n;
        
        valor1 = (fatorial(m))/(fatorial(n)*fatorial(diferenca));
        
        return valor1;
    }
    
    public static int permutacoes(int m, int n){
    int valor2, diferenca;
        
    diferenca = m - n;
        
    valor2 = (fatorial(m))/(fatorial(diferenca));
        
    return valor2;
    }
    
    public static int fatorial(int fatorial){
        int fatorialFinal=1, i;
        
        if (fatorial!=0){
            for (i=1; fatorial>=i; i++){
                fatorialFinal = i * fatorialFinal;
            }
        }
        return fatorialFinal;
    }
    
}
