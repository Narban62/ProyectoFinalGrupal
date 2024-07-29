package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.ProductFinalRepository;
import ec.edu.uce.GrupalLogica.model.entidades.ProductFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductFinalServiceImpl implements ProductFinalService {

    @Autowired
    private ProductFinalRepository productoFinalRepository;

    @Override
    public List<ProductFinal> listarProductosFinales() {
        return productoFinalRepository.findAll();
    }

    @Override
    public ProductFinal guardarProductoFinal(ProductFinal productoFinal) {
        return productoFinalRepository.save(productoFinal);
    }

    @Override
    public void eliminarProductoFinal(Long id) {
        productoFinalRepository.deleteById(id);
    }
}
