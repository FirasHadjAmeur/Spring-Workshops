package com.example.demo.Controllers;

import com.example.demo.Entity.Inscription;
import com.example.demo.Interfaces.IInscriptionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscription")
@Tag(name = "Inscription Management", description = "API for Inscription")
public class InscriptionRestController {

    @Autowired
    IInscriptionService inscriptionService;

    // http://localhost:8088/ski/inscription/retrieve-all-inscriptions
    @Operation(summary = "Get all inscriptions", description = "Get all inscriptions", tags = { "Inscription" })
    @GetMapping("/retrieve-all-inscriptions")
    public List<Inscription> getInscriptions() {
        return inscriptionService.retrieveAllInscriptions();
    }

    // http://localhost:8088/ski/inscription/retrieve-inscription/8
    @Operation(summary = "Get inscription by id", description = "Get inscription by id", tags = { "Inscription" })
    @GetMapping("/retrieve-inscription/{inscription-id}")
    public Inscription retrieveInscription(@PathVariable("inscription-id") Long InscriptionId) {
        return inscriptionService.retrieveInscription(InscriptionId);
    }

    // http://localhost:8088/ski/inscription/add-inscription
    @Operation(summary = "Add inscription", description = "Add inscription", tags = { "Inscription" })
    @PostMapping("/add-inscription")
    public Inscription addInscription(@RequestBody Inscription i) {
        return inscriptionService.addInscription(i.getIdSkieur(), i.getNumCours());
    }

    // http://localhost:8088/ski/inscription/remove-inscription/{inscription-id}
    @Operation(summary = "Remove inscription", description = "Remove inscription", tags = { "Inscription" })
    @DeleteMapping("/remove-inscription/{inscription-id}")
    public void removeInscription(@PathVariable("inscription-id") Long InscriptionId) {
        inscriptionService.removeInscription(InscriptionId);
    }

    // http://localhost:8088/ski/inscription/modify-inscription
    @Operation(summary = "Modify inscription", description = "Modify inscription", tags = { "Inscription" })
    @PutMapping("/modify-inscription")
    public Inscription modifyInscription(@RequestBody Inscription i) {
        return inscriptionService.modifyInscription(i);
    }
}
