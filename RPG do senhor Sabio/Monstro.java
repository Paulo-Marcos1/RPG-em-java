public class Monstro extends Personagem {
    private String nome = "Ricardo Eletro";

    public Monstro() {
        this.vida = 350;
        this.ataque = 37;
        this.defesa = 5;
    }

    public int ataque() {
        return ataque;
    }

    public int defesa() {
        return defesa;
    }

    public int vida() {
        return vida;
    }




    public void receberataque(int dano) {
        System.out.println("A vida do " + this.nome + " era: " + vida());
        this.vida = vida() + defesa() - dano;
        System.out.println("A vida do " + this.nome + " agora é: " + this.vida);
        if (this.vida < 1) {
            this.vida = 0;
        }

    }

    public void atacar() {
        System.out.println(this.nome + " atacou com força de " + this.ataque);
    }

    public String getNome() {
        return this.nome;
    }
}
