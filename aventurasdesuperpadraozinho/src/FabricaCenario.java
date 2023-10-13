public abstract class FabricaCenario {
    protected FabricaCenario() {
        // Construtor protegido para evitar instanciação direta
    }

    public abstract Cenario fabricaCenario();

    // Método a ser implementado nas subclasses concretas para criar uma instância concreta de cenário.
    protected abstract FabricaCenario criarInstanciaConcreta();
}
