package bridge.exercise;

public class RedFacebook implements IRedSocial{
    private int cantUsuarios;
    private int cantUsuariosConectados;

    public RedFacebook(int cantUsuarios, int cantUsuariosConectados) {
        this.cantUsuarios = cantUsuarios;
        this.cantUsuariosConectados = cantUsuariosConectados;
    }

    @Override
    public void showInfo(ISistemas sistemas) {
        System.out.println("*****************************************FACEBOOK*****************************************");
        System.out.println("Cantidad de Usuarios: "+cantUsuarios);
        System.out.println("Cantidad de Usuarios Conectados: "+cantUsuariosConectados);
        System.out.println("MOSTRANDO LA INFORMACION.....");
        sistemas.inscripcion();
    }
}
