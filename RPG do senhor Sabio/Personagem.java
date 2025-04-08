abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected String classe;
    //Modo defesa - Pensamento.  Precisa de um modo contra-ataque pra fazer sentido//
    //Modo contra-ataque: Pode ter um acrescimo de dano por acertar e será feito com a chance de 1/5//
    // random (monstro)  pra gente escolha Scanner
    // case 1:
    //if (escolha == 1)
    //
    //    modoCA
    //      random 1/5  if(numero =! random)  0 miss
    //case 2
    // if(escolha == 2)
    //   modo_defesa
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
