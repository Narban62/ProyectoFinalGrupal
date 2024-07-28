package ec.edu.uce.GrupalPersistencia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserService userService;

    @Autowired
    public AuthenticationServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean authenticate(String email, String password) {
        return userService.checkIfValidUser(email, password);
    }
}