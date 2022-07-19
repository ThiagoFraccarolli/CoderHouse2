package edu.coderhouse.Jpaproyect.controller;

import edu.coderhouse.Jpaproyect.model.Comprobante;
import edu.coderhouse.Jpaproyect.service.comprobante.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {

    @Autowired
    ComprobanteService comprobanteService;

    //*******************
    //***Getmap*********
    //*******************

    @GetMapping("")
    public List<Comprobante> mostrarTablaOriginal(){
        return comprobanteService.mostrartodos();
    }

    @GetMapping("/{id}")
    public Comprobante mostrarPorId(@PathVariable int id){return comprobanteService.mostrarComprobante(id);}

    //*******************
    //***Postmap*********
    //*******************

    @PostMapping("/crear")
    public Comprobante crearComprobante(@RequestBody Comprobante comprobante){return comprobanteService.crearComprobante(comprobante);}

    @PostMapping("/actualizar")
    public Comprobante actualizarComprobante(@RequestBody Comprobante comprobante){return comprobanteService.actualizarComprobante(comprobante);}



}
