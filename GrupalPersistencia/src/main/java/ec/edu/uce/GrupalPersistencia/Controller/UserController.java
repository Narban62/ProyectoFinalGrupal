package ec.edu.uce.GrupalPersistencia.Controller;


import ec.edu.uce.GrupalPersistencia.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userService;



}
