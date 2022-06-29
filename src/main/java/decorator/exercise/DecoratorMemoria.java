package decorator.exercise;

public class DecoratorMemoria extends Decorar{
    private int precio;
    private int memoria;

    public DecoratorMemoria(IMarca marca, int precio,int memoria) {
        super(marca);
        this.precio = precio;
        this.memoria=memoria;
    }

    @Override
    public void decorarCelular(Celular celular) {
        System.out.println("-------------OBTENIENDO MEMORIA EXTERNA---------------");
        System.out.println("Almacenamiento inicial: "+celular.getAlmacenamiento());
        celular.setPrecio(celular.getPrecio()+precio);
        celular.setAlmacenamiento(celular.getAlmacenamiento()+memoria);
        celular.showInfo();
    }
}
