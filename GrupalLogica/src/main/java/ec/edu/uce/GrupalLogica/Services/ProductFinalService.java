package ec.edu.uce.GrupalLogica.Services;


import ec.edu.uce.GrupalLogica.model.entidades.ProductFinal;

import java.util.List;

public interface ProductFinalService {
    List<ProductFinal> listarProductosFinales();

    ProductFinal guardarProductoFinal(ProductFinal productoFinal);

    void eliminarProductoFinal(Long id);
}
