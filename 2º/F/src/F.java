import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double raio, altura;
        String solidos;
        boolean fim;
        
        do {
            
            solidos = sc.next();
            
            switch (solidos){
                case "cilindro":
                    raio = sc.nextDouble();
                    altura = sc.nextDouble();
                    System.out.printf("%.2f%n",vCilindro(raio, altura));
                    break;
                case "esfera":
                    raio = sc.nextDouble();
                    System.out.printf("%.2f%n",vEsfera(raio));
                    break;
                case "cone":
                    raio = sc.nextDouble();
                    altura = sc.nextDouble();
                    System.out.printf("%.2f%n",vCone(raio,altura));
                    break;
            }
            
            
            fim = solidos.equals("fim");
        } while (fim == false);
        
    }
    
    
    
    
    public static double vCilindro(double raio, double altura){
        double volumeCi;
        
        volumeCi = Math.PI*Math.pow(raio, 2)*altura;
        
        return volumeCi;
    }
    
    public static double vEsfera(double raio){
        double volumeE;
        
        volumeE = (4.0/3.0)*Math.PI*Math.pow(raio, 3);
        
        return volumeE;
    }
    
    public static double vCone(double raio, double altura){
        double volumeCo;
        
        volumeCo = (1.0/3.0)*Math.PI*Math.pow(raio, 2)*altura;
        
        return volumeCo;
    }    
        

}
