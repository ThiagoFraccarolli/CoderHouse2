package edu.coderhouse.Jpaproyect.service.cliente;

import edu.coderhouse.Jpaproyect.dto.ClienteDto;
import edu.coderhouse.Jpaproyect.model.Cliente;
import edu.coderhouse.Jpaproyect.repository.ClientesRepository;
import edu.coderhouse.Jpaproyect.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ClientesServiceimpl implements ClienteService {

    @Autowired
    ClientesRepository clientesRepository;

    Cliente clienteamostrar;

    int edad;

    Cliente cliente;

    List<Cliente> copialista;



    @Override
    public List<Cliente> mostrartodos() {
        return clientesRepository.findAll();
    }


    @Override
    public ClienteDto mostrarClientedto(int id) {
        cliente= clientesRepository.findById(id).orElse(null);
        edad= calcular(cliente);
        ClienteDto clienteamostrar = new ClienteDto(cliente.getIdcliente(),cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
        return clienteamostrar;
    }

    private int calcular(Cliente cliente) {

        Date fecha= cliente.getFechanacimiento();
        String fechaString = fecha.toString();
        int anio = Integer.parseInt(fechaString.substring(0,4));
        int mes = Integer.parseInt(fechaString.substring(5,7));
        int dia = Integer.parseInt(fechaString.substring(8,10));
        int edad = Period.between(LocalDate.of(anio,mes,dia),LocalDate.now()).getYears();
        return edad;

    }
    @Override
        public List<ClienteDto> mostrarListEdad(){
        copialista=clientesRepository.findAll();
        List<ClienteDto> listaamostrar= new ArrayList<>();
        int finalLista = copialista.size();
        for (int i=0;i<finalLista;i++){
            cliente= copialista.get(i);
            edad= calcular(cliente);
            ClienteDto clienteamostrar = new ClienteDto(cliente.getIdcliente(),cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            listaamostrar.add(clienteamostrar);
        }
        return listaamostrar;
        }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        copialista = clientesRepository.findAll();
        int finalLista = copialista.size();
        int idNuevoCliente = finalLista+1;
        cliente.setIdcliente(idNuevoCliente);
        return clientesRepository.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        int ultimoCliente = clientesRepository.findAll().size();
        if (cliente.getIdcliente()>0 && cliente.getIdcliente()<= ultimoCliente){
            return clientesRepository.save(cliente);
        }
        return null;
    }
}
