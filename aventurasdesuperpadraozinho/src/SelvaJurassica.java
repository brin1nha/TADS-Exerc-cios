public class SelvaJurassica extends Cenario implements FabricaAnimal{
    @Override
    public AnimalPerigoso criarAnimalPerigoso() {
        return new Serpente();
    }
    @Override
    public AnimalTransporte criarAnimalTransporte() {
        return new Dromedario();
    }
}



