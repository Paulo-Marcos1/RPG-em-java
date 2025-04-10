abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected String classe;


    public abstract int contraAtaque(Personagem inimigo);
            public String getClasse() {
        return classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract int ataque();

    public abstract int vida();

    public abstract int defesa();

    public abstract void receberataque(int dano);

    public abstract void atacar();


}
