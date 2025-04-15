import java.util.Scanner;


public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int escolha_ataque;
        Personagem jogador = null;
        Monstro monstro = new Monstro();

        while(jogador == null) {

            System.out.print("Digite 1: Para mago \nDigite 2: Para arqueiro \nDigite 3: Para guerreiro \nEscolha: ");
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
        System.out.println("Olá "+ jogador.getClasse() + " "+jogador.getNome() + ", começará agora sua nova aventura!");
        int turno = 0;
        int escolha ;
        while(true) {
            turno ++;
            if (turno %2 != 0){
                System.out.println("-------------------------");
                System.out.println(turno + "ª Turno vez do " + jogador.getNome());
                Thread.sleep(400);
                int dano = 0;
                while(true) {
                    jogador.infoAtaque();
                    Thread.sleep(400);
                    escolha_ataque = input.nextInt();
                    input.nextLine();
                    dano = jogador.ataque(escolha_ataque);
                    if (escolha_ataque == 1 || escolha_ataque == 2 || escolha_ataque == 3) {
                        break;
                    }else{
                        Thread.sleep(500);
                    }
                    }escolha = (int) (Math.random() * 2) + 1;
                    switch (escolha) {
                        case 1:
                            System.out.println(monstro.getNome() + " escolheu o modo defesa!");
                            Thread.sleep(400);
                            monstro.defesa = 5;
                            monstro.receberataque(dano);
                            monstro.defesa = 0;
                            break;
                        case 2:
                            System.out.println(monstro.getNome() + " esta tentando contra atacar");
                            Thread.sleep(700);
                            int tentativa = (int) (Math.random() * 4);
                            if (tentativa != 0) {
                                System.out.println("O contra-ataque do " + monstro.getNome() + " falhou!");
                                Thread.sleep(400);
                                monstro.receberataque(dano);
                                break;
                            } else {
                                System.out.println(monstro.getNome() + " teve sucesso ao contra atacar!");
                                Thread.sleep(400);
                                monstro.contraAtaque(jogador);
                                System.out.println("A vida do " + jogador.getNome() + " é de: " + jogador.vida());
                                break;
                            }


                    }
                    Thread.sleep(2000);


            }
            else {
                System.out.println("\n-------------------------");
                System.out.println(turno + "ª Turno vez do "+ monstro.getNome());
                while (true) {


                    monstro.atacar();
                    Thread.sleep(600);
                    System.out.print("\nDigite 1 para defender\nDigite 2 para tentar contra-atacar(chance de 1/5 de sucesso!)\nEscolha: ");
                    escolha = input.nextInt();
                    input.nextLine();
                    switch (escolha){
                        case 1:
                            System.out.println("Voce escolheu o modo defesa!");
                            Thread.sleep(500);
                            jogador.defesa = 30;
                            jogador.receberataque(monstro.ataque(1));
                            jogador.defesa = 0;
                            break;
                        case 2:
                            System.out.println("Voce esta tentando contra atacar");
                            Thread.sleep(700);
                            int tentativa = (int) (Math.random()*4);
                            if (tentativa != 0){
                                System.out.println("O contra-ataque falhou!");
                                jogador.receberataque(monstro.ataque(1));


                            }else {
                                System.out.println("Sucesso ao contra atacar!");
                                jogador.ataque(1);
                                jogador.contraAtaque(monstro);
                                System.out.println("A vida do "+ monstro.getNome() +" é de: "+ monstro.vida());


                            }
                            break;

                        default:
                            System.out.println("opção invalida!");

                    }
                    if(escolha == 1 || escolha == 2) {
                        Thread.sleep(2000);
                        break;
                    }else {
                        Thread.sleep(500);
                    }
                }

            }
            if (jogador.vida() < 1){
                System.out.println("Game Over!");
                break;
            } else if (monstro.vida() < 1) {
                System.out.println("Parabens você ganhou!");
                break;

            }


        }

    }
}

