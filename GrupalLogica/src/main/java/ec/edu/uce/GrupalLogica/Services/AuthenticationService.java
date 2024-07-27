package ec.edu.uce.GrupalLogica.Services;

public interface AuthenticationService {
    boolean authenticate(String email, String password);
}