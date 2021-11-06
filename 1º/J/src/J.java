import java.util.Scanner;

public class J {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N, n, numero,x, alg, totalAlg=0, numDivisiveis=0;
        double percentagem, maxPercentagem=0;
        
        N = sc.nextInt();
        
        if (N > 0){
            for (n=1; n<=N; n++){
                numero = sc.nextInt();
                x = numero;
                
                while (x!=0){
                    alg = x%10;
                    totalAlg++;
                    if (alg!=0){
                        if (numero%alg==0){
                            numDivisiveis++;
                        }
                    }
                    x = x/10;   
                }
                
                percentagem =  (double)numDivisiveis / (double)totalAlg * 100; 
                System.out.printf("%.2f%%\n", percentagem);
                
                if (maxPercentagem < percentagem){
                    maxPercentagem = percentagem;
                }
                
                totalAlg = 0;
                numDivisiveis = 0;
            }
            System.out.printf("(%.2f%%)\n", maxPercentagem);
        }
        
    }
    
}
