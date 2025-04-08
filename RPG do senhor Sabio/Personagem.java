//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    Personagem() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void ataque();

    public abstract void vida();

    public abstract void defesa();

    public abstract void receberataque(int var1);

    public abstract void atacar();
}
