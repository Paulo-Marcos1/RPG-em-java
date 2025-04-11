public class Monstro extends Personagem {
    private String nome = "Ricardo Eletro";

    public Monstro() {
        this.vida = 350;
        this.ataque = 37;
        this.defesa = 0;
    }

    @Override
    public void infoAtaque() {

    }

    public int ataque(int escolha) {
        if (escolha == 1){
            this.ataque = 37;
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
        if (defesa < dano) {
            this.vida = vida() + defesa() - dano;
            if (this.vida < 1) {
                this.vida = 0;
            }
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
