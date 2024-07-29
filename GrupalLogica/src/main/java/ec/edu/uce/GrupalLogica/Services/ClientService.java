package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.ClientRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Client;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientService {

    @Autowired
    public ClientRepository clientRepository;

    public List<Client> listarClientes() {
        return clientRepository.findAll();
    }

    public Client guardarCliente(Client client) {
        return clientRepository.save(client);
    }

}
