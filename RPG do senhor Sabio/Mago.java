public class Mago extends Personagem {
    private String classe = "Mago";

    public Mago(){
        this.vida = 100;
        this.defesa = 5;
        this.ataque = 24;
    }

    public String getClasse() {
        return classe;
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
        System.out.println("A vida do " + this.nome + "era: " + this.vida);
        this.vida = vida() + this.defesa - dano;
        System.out.println("A vida do " + this.nome + "agora é: " + this.vida);
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
