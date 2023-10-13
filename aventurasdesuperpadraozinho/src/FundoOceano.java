public class FundoOceano extends Cenario implements FabricaAnimal {
    @Override
    public AnimalPerigoso criarAnimalPerigoso() {
        return new TubaraoBranco();
    }
    @Override
    public AnimalTransporte criarAnimalTransporte() {
        return new CavaloMarinho();
    }
}
