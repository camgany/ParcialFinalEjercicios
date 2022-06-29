package bridge.exercise;

public class RedTwitter implements IRedSocial{
    private int cantUsuarios;
    private int cantUsuariosConectados;

    public RedTwitter(int cantUsuarios, int cantUsuariosConectados) {
        this.cantUsuarios = cantUsuarios;
        this.cantUsuariosConectados = cantUsuariosConectados;
    }

    @Override
    public void showInfo(ISistemas sistemas) {
        System.out.println("*****************************************TWITTER*****************************************");
        System.out.println("Cantidad de Usuarios: "+cantUsuarios);
        System.out.println("Cantidad de Usuarios Conectados: "+cantUsuariosConectados);
        System.out.println("MOSTRANDO LA INFORMACION.....");
        sistemas.inscripcion();
    }
}
