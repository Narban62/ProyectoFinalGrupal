package ec.edu.uce.GrupalLogica.controller;


import ec.edu.uce.GrupalLogica.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userService;



}
