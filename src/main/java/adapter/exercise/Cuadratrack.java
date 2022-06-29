package adapter.exercise;

public class Cuadratrack {
    private String nombre;
    private String placa;
    private ICuadratrack cuadratrack;
    private int capacidad;

    public Cuadratrack(String nombre, String placa, ICuadratrack cuadratrack, int capacidad) {
        this.nombre = nombre;
        this.placa = placa;
        this.cuadratrack = cuadratrack;
        this.capacidad = capacidad;
    }

    public ICuadratrack getCuadratrack() {
        return cuadratrack;
    }

    public void setCuadratrack(ICuadratrack cuadratrack) {
        this.cuadratrack = cuadratrack;
    }
    public void showInfo(){
        System.out.println("********************************************************CUADRATRACK INFO********************************************************");
        System.out.println("Nombre: "+nombre);
        System.out.println("Placa: "+placa);
        System.out.println("Estado Gasolina: " + cuadratrack.estadoCOmbustible());
        System.out.println("Llenar Gasolina: "+cuadratrack.llenarGasolina(capacidad));
    }
}
