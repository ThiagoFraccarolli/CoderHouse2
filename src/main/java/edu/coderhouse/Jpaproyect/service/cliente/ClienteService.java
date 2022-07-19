package edu.coderhouse.Jpaproyect.service.cliente;

import edu.coderhouse.Jpaproyect.dto.ClienteDto;
import edu.coderhouse.Jpaproyect.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> mostrartodos();

    ClienteDto mostrarClientedto(int dni);

    List<ClienteDto> mostrarListEdad();

    Cliente crearCliente(Cliente cliente);

    Cliente actualizarCliente(Cliente cliente);
}
