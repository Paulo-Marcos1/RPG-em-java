public class Guerreiro extends Personagem {
    private String classe = "Guerreiro";

    public Guerreiro(){
        this.vida = 100;
        this.defesa = 26;
        this.ataque = 20;
    }

    public  String getClasse(){
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
