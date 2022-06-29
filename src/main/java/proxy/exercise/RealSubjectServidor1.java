package proxy.exercise;

import java.util.ArrayList;
import java.util.List;

public class RealSubjectServidor1 implements ICluster {

    private String nombre;
    private List<Usuario> usuarios = new ArrayList<>();

    public RealSubjectServidor1(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void login(Usuario usuario, String password) {
        System.out.println("*********************************************************************************");
        System.out.println("Uniendo al Servidor 1 al usurio: "+usuario.getNombre());
        usuarios.add(usuario);
        System.out.println("Guardado exitosamente!");
        System.out.println("*********************************************************************************");
    }
}
