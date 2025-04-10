

public class Arqueiro extends Personagem {
    private String classe = "Arqueiro";

    public Arqueiro(){
        this.vida = 100;
        this.defesa = 20;
        this.ataque = 15;
    }




    public void setClasse(String classe) {
        this.classe = classe;
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
