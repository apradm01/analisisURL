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
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;
        int h4 = 0;
        int images = 0;

        try {
            HtmlPage page = webClient.getPage(url);
            direccion.setUrl(url);
            direccion.setTitle(page.getTitleText());
            rawText = page.asNormalizedText();

            for (counter = 0; counter < rawText.length(); counter++){
                switch(rawText.charAt(counter)){
                    case 'h':
                        if (rawText.charAt(counter+1) == '1'){
                            h1++;
                        } else if (rawText.charAt(counter+1) == '2'){
                            h2++;
                        } else if (rawText.charAt(counter+1) == '3'){
                            h3++;
                        } else if (rawText.charAt(counter+1) == '4'){
                            h4++;
                        }
                        break;
                    case 'i':
                        if (rawText.charAt(counter+1) == 'm' && rawText.charAt(counter+2) == 'g'){
                            images++;
                        }
                }
            }
            //Los titulos h1,h2,h3 y h4 aparecen tanto para abrir como cerrar un texto
            //El contador final de los mismos es por ende la mitad de lo que hemos contado
            h1 = h1/2;
            h2 = h2/2;
            h3 = h3/2;
            h4 = h4/2;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return direccion;
    }


}
