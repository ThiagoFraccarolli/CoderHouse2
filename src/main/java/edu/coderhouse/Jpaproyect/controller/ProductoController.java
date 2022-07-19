package edu.coderhouse.Jpaproyect.controller;

import edu.coderhouse.Jpaproyect.model.Producto;
import edu.coderhouse.Jpaproyect.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    //*******************
    //***Getmap*********
    //*******************

    @GetMapping("")
    public List<Producto> mostrarTablaOriginal(){
        return productoService.mostrartodos();
    }

    @GetMapping("/{id}")
    public Producto mostrarPorId(@PathVariable int id){return productoService.mostrarProducto(id);}


    //*******************
    //***Postmap*********
    //*******************

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto){return productoService.crearProducto(producto);}

    @PostMapping("/actualizar")
    public Producto actualizarProducto(@RequestBody Producto producto){return productoService.actualizarProducto(producto);}

}

