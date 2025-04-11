public class Guerreiro extends Personagem {
    private String classe = "Guerreiro";

    public Guerreiro(){
        this.vida = 100;
        this.defesa = 0;
        this.ataque = 20;
    }

    public  String getClasse(){
        return classe;
    }

    public int ataque(int escolha) {

        return ataque;
    }

    public int defesa() {

        return defesa;
    }

    public int vida() {

        return vida;
    }

    @Override
    public void infoAtaque() {

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
        System.out.println(this.nome + " atacou com força de " + this.ataque);
    }

    public String getNome() {
        return this.nome;
    }
}
