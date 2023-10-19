package com.analizarurl.demo.rest;


import com.analizarurl.demo.model.Titulos;
import com.analizarurl.demo.service.TitulosService;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/titulos/")
public class TitulosREST {
    private final TitulosService titulosService;

    public TitulosREST(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    /*@GetMapping("{id}")
    private ResponseEntity<List<Titulos>> getAllDireccion (@PathVariable("id") Example<S> idTitulos){
        return ResponseEntity.ok( titulosService.findAll(idTitulos));
    }*/
}
