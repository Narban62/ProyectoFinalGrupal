package ec.edu.uce.GrupalLogica.controller;

import ec.edu.uce.GrupalLogica.model.interfaces.IAdmin;

public class Container {

    private IAdmin admin;

    public Container(IAdmin admin) {
        this.admin = admin;
    }

    public void authenticateAdmin(String email, String password) {
        // Lógica para autenticar con el servidor
//        boolean isAuthenticated = serverConnection.authenticateUser(email, password);
        if (true) {
            admin.login(email, password);
        } else {
            // Manejo de error de autenticación
            System.out.println("Error: Autenticación fallida. Verifique sus credenciales.");
        }
    }
}

