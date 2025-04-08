//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Monstro extends Personagem {
    private String nome = "Ricardo Eletro";

    public Monstro() {
    }

    public void ataque() {
        int ataque = 37;
    }

    public void defesa() {
        int defesa = 5;
    }

    public void vida() {
        int vida = 350;
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
