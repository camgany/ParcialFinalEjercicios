package decorator.exercise;

public class MarcaSamsung implements IMarca {
    @Override
    public void agregarCelular(Celular celular) {
        celular.setCpu("Samsung");
        celular.setAlmacenamiento(50);
        celular.setRam(16);
        System.out.println("////////////////////////////INFORMACION INICIAL///////////////////////////////");
        celular.showInfo();
    }

    @Override
    public void decorarCelular(Celular celular) {

    }
}
