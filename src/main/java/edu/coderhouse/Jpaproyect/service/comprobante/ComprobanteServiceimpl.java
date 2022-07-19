package edu.coderhouse.Jpaproyect.service.comprobante;

import edu.coderhouse.Jpaproyect.model.Comprobante;
import edu.coderhouse.Jpaproyect.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ComprobanteServiceimpl implements ComprobanteService {

    @Autowired
    ComprobanteRepository comprobanteRepository;

    @Override
    public List<Comprobante> mostrartodos() {
        return comprobanteRepository.findAll();
    }

    @Override
    public Comprobante mostrarComprobante(int id) {
        return comprobanteRepository.findById(id).orElse(null);
    }

    @Override
    public Comprobante crearComprobante(Comprobante comprobante) {
        List<Comprobante> copialista = comprobanteRepository.findAll();
        int finalLista = copialista.size();
        int idNuevoComprobante = finalLista+1;
        comprobante.setIdcomprobante(idNuevoComprobante);
        return comprobanteRepository.save(comprobante);
    }

    @Override
    public Comprobante actualizarComprobante(Comprobante comprobante) {
        int ultimoComprobante = comprobanteRepository.findAll().size();
        if (comprobante.getIdcomprobante() > 0 && comprobante.getIdcomprobante() <= ultimoComprobante){
            return comprobanteRepository.save(comprobante);
        }
        return null;
    }
}
