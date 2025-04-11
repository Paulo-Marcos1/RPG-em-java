

public class Arqueiro extends Personagem{
    private String classe = "Arqueiro";

    public Arqueiro(){
        this.vida = 100;
        this.defesa = 0;
        this.ataque = 0;
    }

    @Override
    public void infoAtaque() {
        System.out.println("Ataque 1: Ataque normal 15 de dano!");
        System.out.println("Ataque 2: Flechada dupla 30 de dano!");
        System.out.println("Ataque 3: Saraivada de flechas 50 de dano!");
        System.out.print("Escolha:");
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public int ataque(int escolha) {

            switch (escolha) {
                case 3:
                    System.out.println("Voce escolheu saraivada de flechas!");
                    this.ataque = 50;
                    break;
                case 2:
                    System.out.println("Flechada dupla!");
                    this.ataque = 30;
                    break;
                case 1:
                    System.out.println("Ataque normal!");
                    this.ataque = 15;
                    break;
                default:
                    System.out.println("Opção invalida");

            }
            return ataque;


    }

    public int defesa() {
        return defesa;
    }

    public int vida() {
        return vida;
    }

    @Override
    public int contraAtaque(Personagem inimigo) {
       int dano = this.ataque + 50;
        inimigo.vida -= dano;
        return vida;
    }

    public void receberataque(int dano) {
        System.out.println("A vida do " + this.nome + " era: " + vida());
        this.vida = vida() + defesa() - dano;
        if (this.vida < 1) {
            this.vida = 0;
        }
        System.out.println("A vida do " + this.nome + " agora é: " + this.vida);

    }


    public void atacar() {
        System.out.println(this.nome + " vai atacar com força de  " + this.ataque);
    }

    public String getNome() {
        return this.nome;
    }
}
