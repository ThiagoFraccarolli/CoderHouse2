package edu.coderhouse.Jpaproyect.service.comprobante;

import edu.coderhouse.Jpaproyect.model.Comprobante;
import edu.coderhouse.Jpaproyect.model.Producto;

import java.util.List;

public interface ComprobanteService {
    List<Comprobante> mostrartodos();

    Comprobante mostrarComprobante(int id);

    Comprobante crearComprobante(Comprobante comprobante);

    Comprobante actualizarComprobante(Comprobante comprobante);
}
