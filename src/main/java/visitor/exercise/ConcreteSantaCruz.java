package visitor.exercise;

public class ConcreteSantaCruz implements ICiudad {
    private String nombre;
    private int numeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private int dineroTurismo;

    public ConcreteSantaCruz(String nombre, int numeroProvincias, int numeroHabitantes, String clima, int dineroTurismo) {
        this.nombre = nombre;
        this.numeroProvincias = numeroProvincias;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = clima;
        this.dineroTurismo = dineroTurismo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProvincias() {
        return numeroProvincias;
    }

    public void setNumeroProvincias(int numeroProvincias) {
        this.numeroProvincias = numeroProvincias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(int dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }

    @Override
    public void accept(IVisitante visitor) {
        // logica
        visitor.visitSantaCruz(this);
    }
    @Override
    public void showInfo() {
        System.out.println("----------------------------USTED SE ENCUENTRA EN SANTA CRUZ--------------------------------------");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Numero De Provincias: "+this.numeroProvincias);
        System.out.println("Numero De Habitantes: "+this.numeroHabitantes);
        System.out.println("Clima: "+this.clima);
        System.out.println("Dinero Por Turismo: "+this.dineroTurismo);
    }
}

