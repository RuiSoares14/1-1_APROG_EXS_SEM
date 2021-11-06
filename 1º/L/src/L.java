
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno DEI
 */
public class L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int N, nPerfeito = 0, x = 1, total, n;

        do {
            N = sc.nextInt();
        } while (N <= 0);

        while (nPerfeito < N) {
            total =  0;

            for (int i = 1; i <= (x / 2); i++) {
                if (x % i == 0) {
                    total = total + i;

                }
            }
            if (total == x) {
                System.out.println(x);
                nPerfeito++;
            }

            x = x + 1;
        }
    }

}
