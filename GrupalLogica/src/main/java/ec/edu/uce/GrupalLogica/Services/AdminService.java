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

}
