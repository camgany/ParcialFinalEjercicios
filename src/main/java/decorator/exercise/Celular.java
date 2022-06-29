package decorator.exercise;

public class Celular {
    private int ram;
    private int almacenamiento;
    private String cpu;
    private int precio;

    public Celular( int precio) {
        this.precio = precio;

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void showInfo(){
        System.out.println("====INFO CELULAR======");
        System.out.println("RAM: "+ram);
        System.out.println("CPU: "+cpu);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("Precio: "+precio);
    }
}
