package ec.edu.uce.GrupalPersistencia.Services;



import ec.edu.uce.GrupalPersistencia.Entities.ProductFinal;

import java.util.List;

public interface ProductFinalService {
    List<ProductFinal> listarProductosFinales();
    ProductFinal guardarProductoFinal(ProductFinal productoFinal);
    void eliminarProductoFinal(Long id);
}
