import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Personagem jogador = null;
        Monstro monstro = new Monstro();

        while(jogador == null) {
            System.out.print("Digite 1: Para mago \nDigite 2: Para arqueiro \nDigite 3 Para guerreiro \nEscolha:");
            int escolha = input.nextInt();
            input.nextLine();
            switch (escolha) {
                case 1:
                    jogador = new Mago();
                    System.out.println("Você escolheu ser um Mago!");
                    break;
                case 2:
                    jogador = new Arqueiro();
                    System.out.println("Você escolheu ser um arqueiro!");
                    break;
                case 3:
                    jogador = new Guerreiro();
                    System.out.println("Você escolheu ser um Guerreiro!");
                    break;

                default:
                    System.out.println("opção invalida!");

            }
        }
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        jogador.setNome(nome);
        System.out.println("Olá "+ jogador.getClasse() + " "+jogador.getNome() + " começará agora sua nova aventura!");
        System.out.println(monstro.getNome());
        int turno = 0;
        while(true) {

            System.out.println("Turno "+ turno++ +" ataque do " + jogador.getNome());
            jogador.atacar();
            monstro.receberataque(jogador.ataque());

            System.out.println("Turno "+ turno++ +" ataque do " + monstro.getNome());
            monstro.atacar();
            jogador.receberataque(monstro.ataque());




             break;


        }

    }
}

