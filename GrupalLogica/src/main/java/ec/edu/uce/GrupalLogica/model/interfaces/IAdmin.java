package ec.edu.uce.GrupalLogica.model.interfaces;

public interface IAdmin {
    void aprobar ();
    void rechazar();
    void asignar();
    void notificar();
    void revisar();
    void solicitar();
    void validar();
    void registrar(String nombre, String apellido, String email, String password);
    void eliminar();
    void login(String email, String password);
}
