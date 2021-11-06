
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        int a,b,c;
        boolean ang;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        ang = lados(a,b,c);
        
        if (ang == true){
            System.out.println("ang(a,b)="+ (int) angulos(a,b,c));
            System.out.println("ang(a,c)="+ (int) angulos(a,c,b));
            System.out.println("ang(b,c)="+ (int) angulos(b,c,a));
        }
    }
    
    
    
    
    public static boolean lados(int lado1, int lado2, int lado3) {
        boolean VF = false;
        
        if (lado1 > 0 && lado2 > 0 && lado3 > 0){
            if (Math.abs(lado2-lado3) < lado1 && lado1 < (lado2+lado3)){
                if (Math.abs(lado1-lado3) < lado2 && lado2 < (lado1+lado3)){
                    if (Math.abs(lado1-lado2) < lado3 && lado3 < (lado2+lado1)){
                        System.out.println("a="+lado1);
                        System.out.println("b="+lado2);
                        System.out.println("c="+lado3);
                        VF = true;
                    }else{
                        System.out.println("impossivel");
                        VF = false;
                    }
                }else{
                    System.out.println("impossivel");
                    VF = false;
                }
            }else{
                System.out.println("impossivel");
                VF = false;
            }           
        }else{
            System.out.println("impossivel");
        }               
        return VF;    
    }    


    public static double angulos(double lado1, double lado2, double lado3){
        double angulo;
        angulo = Math.acos((lado1*lado1 + lado2*lado2 - lado3*lado3) / (2*lado1*lado2));
        angulo = Math.toDegrees(angulo);
        return angulo;
    }
}
