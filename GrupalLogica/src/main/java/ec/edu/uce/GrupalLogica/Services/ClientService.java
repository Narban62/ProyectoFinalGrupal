package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.ClientRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import ec.edu.uce.GrupalLogica.model.entidades.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {

    @Autowired
    public ClientRepository clientRepository;

    public List<Client> listarClientes() {
        return clientRepository.findAll();
    }


    public Client guardarCliente(Client client) {
        return clientRepository.save(client);
    }

    public boolean clientExist(String email) {
        return clientRepository.existsByEmail(email);
    }

    public Client findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }



}
