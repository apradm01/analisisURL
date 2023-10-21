package com.analizarurl.demo.rest;

import com.analizarurl.demo.model.Direccion;
import com.analizarurl.demo.service.DireccionService;
import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlPage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/direccion/")
public class DireccionREST {

    private final DireccionService direccionService;

    public DireccionREST(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    @GetMapping
    private ResponseEntity<List<Direccion>> getAllDireccion (){
        return ResponseEntity.ok(direccionService.findAll());
    }

    @PostMapping
    private ResponseEntity<Direccion> saveDireccion (@RequestBody Direccion direccion){
        try {
            Direccion direccionGuardada = direccionService.save(direccion);
            return ResponseEntity.created(new URI("/direccion/" + direccionGuardada.getDireccion_id())).body(direccionGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    private Direccion getURLInfo (String url){
        WebClient webClient = new WebClient();
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        Direccion direccion = new Direccion();
        String rawText;
        int counter;

        try {
            HtmlPage page = webClient.getPage(url);
            direccion.setUrl(url);
            direccion.setTitle(page.getTitleText());
            rawText = page.asNormalizedText();
            


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return direccion;
    }


}
