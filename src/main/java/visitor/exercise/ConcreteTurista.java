package visitor.exercise;

import java.util.Random;

public class ConcreteTurista implements IVisitante {
    private String nombre;
    private Double montoDinero;
    private String ci;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(Double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public ConcreteTurista(String nombre, Double montoDinero, String ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public void info(){
        System.out.println("=======INFO TURISTA========");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("Saldo: "+montoDinero);
        System.out.println("===========================");
    }

    @Override
    public void visitLaPaz(ConcreteLaPaz concreteElement1) {
        concreteElement1.showInfo();
        if(montoDinero>0){
            info();
            int cant = new Random().nextInt(montoDinero.intValue());
            System.out.println("Monto a gastar: "+cant);
            montoDinero = montoDinero - cant;
            System.out.println("Saldo restante: "+montoDinero);
        }else{
            System.out.println("No se puede realizar la operacion, turista sin dinero.");
        }


    }

    @Override
    public void visitCochabamba(ConcreteCochabamba concreteElement2) {
        concreteElement2.showInfo();
        if (montoDinero>0){
            info();
            double habitantes = concreteElement2.getNumeroHabitantes()*0.10;
            System.out.println("El 10% de los habitantes de: "+concreteElement2.getNombre()+" es "+habitantes);
            if (montoDinero>=habitantes){
                montoDinero=montoDinero-habitantes;
                System.out.println("Saldo restante: "+montoDinero);
            }else{
                System.out.println("No se puede realizar la operacion, turista sin dinero suficiente.");
            }

        }else {
            System.out.println("No se puede realizar la operacion, turista sin dinero.");
        }
    }

    @Override
    public void visitSantaCruz(ConcreteSantaCruz concreteElement3) {
        concreteElement3.showInfo();
        if (montoDinero>0){
            info();
            double provincias = concreteElement3.getNumeroProvincias()*0.50;
            System.out.println("El 50% de las provincias es de: "+provincias);
            if (montoDinero>=provincias){
                montoDinero=montoDinero-provincias;
                System.out.println("Saldo restante: "+montoDinero);
            }else{
                System.out.println("No se puede realizar la operacion, turista sin dinero suficiente.");
            }

        }else {
            System.out.println("No se puede realizar la operacion, turista sin dinero.");
        }

    }
}
