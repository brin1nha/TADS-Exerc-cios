public class FabricaDeserto extends FabricaCenario {
    private static FabricaDeserto INSTANCE = null;

    private FabricaDeserto() {
        // Construtor privado para evitar instanciação direta
    }

    public static FabricaDeserto getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FabricaDeserto();
        }
        return INSTANCE;
    }

    @Override
    public Cenario fabricaCenario() {
        return new Deserto();
    }

    @Override
    protected FabricaCenario criarInstanciaConcreta() {
        return new FabricaDeserto();
    }
}