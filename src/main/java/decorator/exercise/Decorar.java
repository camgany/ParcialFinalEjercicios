package decorator.exercise;

public abstract class Decorar implements IMarca {
    protected IMarca marca;

    public Decorar(IMarca marca) {
        this.marca = marca;
    }

    @Override
    public void agregarCelular(Celular celular) {

    }

}
