public final class Personagem {
    private static final Personagem INSTANCE = new Personagem();
    private String nome;

    private Personagem() {};
    public static Personagem getInstance(){
        return INSTANCE;
    }
    public String getNome (){
        return nome;
    }
    public void set(String nome) {
        this.nome = nome;
    }
}
