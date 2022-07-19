package edu.coderhouse.Jpaproyect.service.producto;

import edu.coderhouse.Jpaproyect.model.Producto;
import edu.coderhouse.Jpaproyect.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceimpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;
    @Override
    public List<Producto> mostrartodos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto mostrarProducto(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        List<Producto> copialista = productoRepository.findAll();
        int finalLista = copialista.size();
        int idNuevoProducto = finalLista+1;
        producto.setIdproducto(idNuevoProducto);
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        int ultimoProducto = productoRepository.findAll().size();
        if (producto.getIdproducto() > 0 && producto.getIdproducto() <= ultimoProducto) {
            return productoRepository.save(producto);
        }
        return null;

    }
}
