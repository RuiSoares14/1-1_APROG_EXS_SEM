import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String palavra;
        int n=0;
        boolean palin;
       
        do{
            palavra = ler.nextLine();
            palin = palíndromo(palavra);
            n++;
        } while (palin == false);
        
        System.out.println(n-1);
        
    }




    public static boolean palíndromo(String palavraPal){
        int inicio, fim;
        boolean VF;
        
        inicio = 0;
        fim = palavraPal.length() - 1;
        
        
        do{
            if(palavraPal.charAt(inicio)==palavraPal.charAt(fim)) {
                VF=true;
            }else{
                VF=false;
                return VF;
            }
            inicio++;
            fim--;
        }while(inicio<fim);
        return VF;
        
    }
}
