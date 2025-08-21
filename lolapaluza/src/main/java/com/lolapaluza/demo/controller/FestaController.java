package com.lolapaluza.demo.controller;

import com.lolapaluza.demo.model.Festa;
import com.lolapaluza.demo.service.FestaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/festa")
public class FestaController {

    private final FestaService partyService;

    @PostMapping
    public ResponseEntity<Festa> salvaUsuario(@RequestBody Festa party){
        return ResponseEntity.ok(partyService.save(party));
    }

    @GetMapping
    public ResponseEntity<List<Festa>> mostrarListaDeUsuario(){
        return ResponseEntity.ok(partyService.findAll());
    }

}