package adapter.exercise;

public class adquirir implements ICuadratrack{
    private IElectricos electricos;

    public adquirir(IElectricos electricos) {
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
