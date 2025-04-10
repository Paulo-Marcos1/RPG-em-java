import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
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
        int escolha ;
        while(true) {
            turno ++;
            if (turno %2 != 0){
                System.out.println("-------------------------");
                System.out.println(turno + "ª Turno vez do "+ jogador.getNome());
                escolha = (int) (Math.random()*2)+1;
                switch (escolha) {
                    case 1:
                        System.out.println(monstro.getNome() + " escolheu o modo defesa!");
                        monstro.defesa = 5;
                        monstro.receberataque(jogador.ataque());
                        monstro.defesa = 0;
                        break;
                    case 2:
                        System.out.println(monstro.getNome() + " esta tentando contra atacar");
                        int tentativa = (int) (Math.random()*4);
                        if (tentativa != 0){
                            System.out.println("O contra-ataque do " +monstro.getNome() + " falhou!");
                            monstro.receberataque(jogador.ataque());

                        }else {
                            System.out.println(monstro.getNome()+" teve sucesso ao contra atacar!");
                            monstro.contraAtaque(jogador);
                            System.out.println("A vida do "+ jogador.getNome() +" é de: "+ jogador.vida());

                        }
                }
                Thread.sleep(1000);
            }
            else {
                System.out.println("\n-------------------------");
                System.out.println(turno + "ª Turno vez do "+ monstro.getNome());
                while (true) {


                    monstro.atacar();
                    System.out.print("\nDigite 1 para defender\nDigite 2 para tentar contra-atacar(chance de 1/5 de sucesso!)\nEscolha: ");
                    escolha = input.nextInt();
                    input.nextLine();
                    switch (escolha){
                        case 1:
                            System.out.println("Voce escolheu o modo defesa!");
                            jogador.defesa = 30;
                            jogador.receberataque(monstro.ataque());
                            jogador.defesa = 0;
                            break;
                        case 2:
                            System.out.println("Voce esta tentando contra atacar");
                            int tentativa = (int) (Math.random()*4);
                            if (tentativa != 0){
                                System.out.println("O contra-ataque falhou!");
                                jogador.receberataque(monstro.ataque());

                            }else {
                                System.out.println("Sucesso ao contra atacar!");
                                jogador.contraAtaque(monstro);
                                System.out.println("A vida do "+ monstro.getNome() +" é de: "+ monstro.vida());

                            }
                            break;

                        default:
                            System.out.println("opção invalida!");
                    }
                    Thread.sleep(900);
                    break;
                }

            }
            if (jogador.vida() == 0){
                System.out.println("Game Over!");
                break;
            } else if (monstro.vida() == 0) {
                System.out.println("Parabens você ganhou!");
                break;

            }


        }

    }
}

