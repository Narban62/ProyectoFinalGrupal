package ec.edu.uce.GrupalPersistencia.Services;

public interface AuthenticationService {
    boolean authenticate(String email, String password);
}