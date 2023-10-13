public class FabricaSelvaJurassica extends FabricaCenario {
    private static FabricaSelvaJurassica instance = null;

    private FabricaSelvaJurassica() {
        // Construtor privado para evitar instanciação direta
    }

    public static FabricaSelvaJurassica getInstance() {
        if (instance == null) {
            instance = new FabricaSelvaJurassica();
        }
        return instance;
    }

    @Override
    public Cenario fabricaCenario() {
        return new SelvaJurassica();
    }

    @Override
    protected FabricaCenario criarInstanciaConcreta() {
        return new FabricaSelvaJurassica();
    }
}