public class Mago extends Personagem {
    private String classe = "Mago";

    public Mago(){
        this.vida = 100;
        this.defesa = 0;
        this.ataque = 0;
    }

    @Override
    public void infoAtaque() {
        System.out.println("Ataque 1: Ataque mágico 20 de dano!");
        System.out.println("Ataque 2: Meteorito de fogo 40 de dano!\n(Consiga 40%!)");
        System.out.println("Ataque 3: Conjuração celestial 60 de dano!\n(Consiga 80%!)");
        System.out.print("Escolha:");
    }

    public String getClasse() {
        return classe;
    }

    public int ataque(int escolha) {
        int aleatorio;
        switch (escolha) {

            case 1:
                System.out.println("Ataque mágico!");
                this.ataque = 20;
                break;
            case 2:
                System.out.println("Meteorito de fogo!");
                aleatorio = (int)(Math.random() * 10) + 1;
                if (aleatorio > 4) {
                    this.ataque = 40;
                    System.out.println("Sucesso ao atacar\n"+ "Você conseguiu " + aleatorio * 10 + "%");
                    break;
                }
                else{
                    System.out.println("Fracasso\n" + "Você só conseguiu " + aleatorio * 10 + "%");
                    this.ataque = 0;
                    break;
                }

            case 3:
                System.out.println("Conjuração celestial!");
                aleatorio = (int)(Math.random() * 10) + 1;
                if (aleatorio > 8) {
                    this.ataque = 60;
                    System.out.println("Sucesso ao atacar\n"+ "Você conseguiu " + aleatorio * 10 + "%");
                    break;
                }
                else{
                    System.out.println("Fracasso\n" + "Você só conseguiu " + aleatorio * 10 + "%");
                    this.ataque = 0;
                    break;
                }
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
        System.out.println(this.nome + " atacou com força de " + this.ataque);
    }

    public String getNome() {
        return this.nome;
    }
}
