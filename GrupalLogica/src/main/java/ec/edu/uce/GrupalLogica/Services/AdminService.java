package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.AdminRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public void save(Admin admin){
        adminRepository.save(admin);
    }

    public boolean adminExist(String email) {
        return adminRepository.existsByEmail(email);
    }

    public Admin findByEmail(String email) {
        return adminRepository.findByEmail(email);
    }

    public String registrarAdmin(String nombre, String apellido, String email, String password) {
        if (adminRepository.existsByEmail(email)) {
            return "Error: El administrador ya existe.";
        } else {
            Admin admin = new Admin(nombre, apellido, email, password);
            adminRepository.save(admin);
            return "Administrador registrado exitosamente.";
        }
    }

}
