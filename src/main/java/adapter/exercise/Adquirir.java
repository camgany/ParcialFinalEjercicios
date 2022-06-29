package adapter.exercise;

public class Adquirir implements ICuadratrack{
    private IElectricos electricos;

    public Adquirir(IElectricos electricos) {
        this.electricos = electricos;
    }


    @Override
    public int llenarGasolina(int atributo) {
        return electricos.cargar(atributo);
    }

    @Override
    public int estadoCOmbustible() {
        return electricos.estadoDeElectricidad();
    }
}
