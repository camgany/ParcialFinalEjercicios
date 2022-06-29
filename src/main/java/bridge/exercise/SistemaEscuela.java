package bridge.exercise;

public class SistemaEscuela implements ISistemas{
    private String nombre;
    private int capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;

    public SistemaEscuela(String nombre, int capacidad, Estudiante[] estudiantes, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
    }

    @Override
    public void inscripcion() {
        System.out.println("-------------------SISTEMA DE ESCUELA----------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("=======Lista Estudiantes======");
        for (Estudiante e: estudiantes
        ) {
            System.out.println("Nombre: "+e.getNombre());
            System.out.println("CI: "+e.getCi());
        }
        System.out.println("==============================");
        System.out.println("Requisitos: "+requisitos);
    }
}

