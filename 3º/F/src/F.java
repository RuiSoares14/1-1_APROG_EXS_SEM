
import java.util.Scanner;

public class F {
    
    public static int meses = 6;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        double array1 [] = new double [meses], depositoInicial;
        
        array1 = preencher(array1);
        depositoInicial = sc.nextDouble();
        montanteFinal(array1, depositoInicial);
    }
    
    public static void montanteFinal(double[] array1, double deposito){
        
        for (int x=0; x<meses; x++){
            deposito = deposito + (deposito * array1[x]);
        }
        
        System.out.printf("valor final=%.2f\n", deposito);
    }
    
    public static double[] preencher(double[] array1){
        
        for (int x=0; x<meses; x++){
            array1[x] = sc.nextDouble();
        }
        
        return array1;
    }
    
}
