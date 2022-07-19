package edu.coderhouse.Jpaproyect.controller;

import edu.coderhouse.Jpaproyect.dto.ClienteDto;
import edu.coderhouse.Jpaproyect.model.Cliente;
import edu.coderhouse.Jpaproyect.service.cliente.ClienteService;
import edu.coderhouse.Jpaproyect.service.cliente.ClientesServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    //*******************
    //***Getmap*********
    //*******************

    @GetMapping("")
    public List<Cliente> mostrarTablaOriginal(){
        return clienteService.mostrartodos();
    }

    @GetMapping("/{id}")
    public ClienteDto mostrarPorId(@PathVariable int id){
        return clienteService.mostrarClientedto(id);
    }

    @GetMapping("/all")
    public List<ClienteDto>mostrarTablaEdad(){
        return clienteService.mostrarListEdad();
    }

    //*******************
    //***Postmap*********
    //*******************

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){return clienteService.crearCliente(cliente);}

    @PostMapping("/actualizar")
    public Cliente actualizarCliente(@RequestBody Cliente cliente){return clienteService.actualizarCliente(cliente);}

    }




