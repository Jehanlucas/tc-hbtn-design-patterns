public abstract class Personagem {
    public String nome ;
    public TipoPersonagem tipo ;
    public int inteligencia;
    public int forca;
    public int vigor;
    public int resistencia;
    public int destreza ;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    @Override
    public String toString() {
        return String.format("Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, resistencia = %d, destreza = %d, dano ataque = %.2f }", nome, tipo, inteligencia, forca, vigor, resistencia, destreza, getDanoAtaque());
    }
}
