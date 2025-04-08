public class Mago extends Personagem {
    public Mago() {
    }

    public void ataque() {
        int ataque = 24;
    }

    public void defesa() {
        int defesa = 5;
    }

    public void vida() {
        int vida = 100;
    }

    public void receberataque(int dano) {
        this.vida = this.vida + this.defesa - dano;
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
