package com.analizarurl.demo.rest;


import com.analizarurl.demo.service.TituloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titulo/")
public class TituloREST {
    private final TituloService tituloService;

    public TituloREST(TituloService tituloService) {
        this.tituloService = tituloService;
    }

    /*@GetMapping("{id}")
    private ResponseEntity<List<Titulos>> getAllDireccion (@PathVariable("id") Example<S> idTitulos){
        return ResponseEntity.ok( titulosService.findAll(idTitulos));
    }*/
}
