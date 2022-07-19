package edu.coderhouse.Jpaproyect.service.producto;

import edu.coderhouse.Jpaproyect.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> mostrartodos();

    Producto mostrarProducto(int id);

    Producto crearProducto(Producto producto);

    Producto actualizarProducto(Producto producto);
}
