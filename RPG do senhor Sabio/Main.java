import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Digite 1: Para mago \nDigite 2: Para arqueiro \nDigite 3 Para guerreiro \nEscolha:");
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    new Mago();
                    System.out.println("mago");
                    break;
                case 2:
                    new Arqueiro();
                    System.out.println("arqueiro");
                    break;
                case 3:
                    new Guerreiro();
                    System.out.println("Guerreiro");
            }
        }
    }
}
