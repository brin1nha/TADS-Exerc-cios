public class FabricaFundoOceano extends FabricaCenario {
    private static FabricaFundoOceano instance = null;

    private FabricaFundoOceano() {
        // Construtor privado para evitar instanciação direta
    }

    public static FabricaFundoOceano getInstance() {
        if (instance == null) {
            instance = new FabricaFundoOceano();
        }
        return instance;
    }

    @Override
    public Cenario fabricaCenario() {
        return new FundoOceano();
    }

    @Override
    protected FabricaCenario criarInstanciaConcreta() {
        return new FabricaFundoOceano();
    }
}
