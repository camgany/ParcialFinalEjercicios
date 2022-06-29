package decorator.exercise;

public class MarcaXiaomi implements IMarca {
    @Override
    public void agregarCelular(Celular celular) {
        celular.setCpu("Xiaomi");
        celular.setAlmacenamiento(60);
        celular.setRam(20);
        System.out.println("////////////////////////////INFORMACION INICIAL///////////////////////////////");
        celular.showInfo();
    }

    @Override
    public void decorarCelular(Celular celular) {

    }
}
