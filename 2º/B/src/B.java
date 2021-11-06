import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numAlunos = 0, numDisciplinas = 0, numAprovados = 0;
        String disciplina;

        do {
            numAlunos = ler.nextInt();
            numDisciplinas = ler.nextInt();
        } while (numAlunos < 0 || numDisciplinas < 0);

        for (int i = 0; i < numDisciplinas; i++) {
            disciplina = ler.next();
            do {
                numAprovados = ler.nextInt();
            } while (numAprovados > numAlunos || numAprovados < 0);

            graficobarras(disciplina, numAlunos, numAprovados);

        }
    }

    //==========================================================
    
    public static void graficobarras(String nomeDisciplina, int numAlunos, int numAprovados) {

        String nAprovados = "", nReprovados = "";
        int numReprovados;

        numReprovados = numAlunos - numAprovados;

        for (int x = 0; x < numAprovados; x++) {
            nAprovados = nAprovados + "*";
        }

        for (int x = 0; x < numReprovados; x++) {
            nReprovados = nReprovados + "*";
        }

        System.out.printf("Disciplina: %s%n", nomeDisciplina);
        System.out.printf("- Positivas: %s%n", nAprovados);
        System.out.printf("- Negativas: %s%n", nReprovados);

    }
}
