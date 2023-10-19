package com.analizarurl.demo.rest;

import com.analizarurl.demo.model.Direccion;
import com.analizarurl.demo.service.DireccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/direccion/")
public class DireccionREST {

    private DireccionService direccionService;

    @GetMapping
    private ResponseEntity<List<Direccion>> getAllDireccion (){
        return ResponseEntity.ok(direccionService.findAll());
    }
}
