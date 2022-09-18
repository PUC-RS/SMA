package Menu;

import java.util.Scanner;

public class Menu {
    private static final String[] OPTIONS = {
            "1 - G/G/1/5 - Chegadas entre 2..4 | Atendimento entre 3..5 \n\t\tQuantidade de números aleatórios:" +
                    " 100.000 \n\t\tTempo inicial: 3 \n\t\tMédia de execuçoes: 5\n",
            "2 - G/G/2/5 - Chegadas entre 2..4 | Atendimento entre 3..5 \n\t\tQuantidade de números aleatórios:" +
                    " 100.000 \n\t\tTempo inicial: 3 \n\t\tMédia de execuçoes: 5"
    };

    public static void menu() {
        final Scanner in = new Scanner(System.in);
        int op;
        while (true) {
            printMenu();
            System.out.println("Escolha uma opcão:");
            op = in.nextInt();

            switch (op) {
                default:
                    System.out.println("Opção invalida. Saindo");
                    System.exit(1);
                case 1:
                    Runner.runOp1();
                    break;
                case 2:
                    Runner.runOp2();
                    break;
            }
        }

    }


    private static void printMenu() {
        for (final String s : OPTIONS) {
            System.out.println(s);
        }
    }
}
