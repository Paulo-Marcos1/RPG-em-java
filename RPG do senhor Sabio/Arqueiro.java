public class Arqueiro extends Personagem {
    private String classe = "Arqueiro";

    public Arqueiro(){
        this.vida = 100;
        this.defesa = 15;
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

    public void receberataque(int dano) {
        System.out.println("A vida do " + this.nome + " era: " + vida());
        vida = vida() + defesa - dano;
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
