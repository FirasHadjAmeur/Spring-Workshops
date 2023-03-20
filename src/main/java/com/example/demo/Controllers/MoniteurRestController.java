package com.example.demo.Controllers;

import com.example.demo.Entity.Moniteur;
import com.example.demo.Interfaces.IMoniteurService;
import com.example.demo.Interfaces.ISkieurService;
import com.example.demo.Services.MoniteurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moniteur")
@Tag(name = "Moniteur Management", description = "API for Moniteur")
public class MoniteurRestController {

    @Autowired
    IMoniteurService moniteurService;

    // http://localhost:8088/ski/moniteur/retrieve-all-moniteurs
    @Operation(summary = "Get all moniteurs", description = "Get all moniteurs", tags = { "Moniteur" })
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }

    // http://localhost:8088/ski/moniteur/retrieve-moniteur/8
    @Operation(summary = "Get moniteur by id", description = "Get moniteur by id", tags = { "Moniteur" })
    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable("moniteur-id") Long proejtId) {
        return moniteurService.retrieveMoniteur(proejtId);
    }

    // http://localhost:8088/ski/moniteur/add-moniteur
    @Operation(summary = "Add moniteur", description = "Add moniteur", tags = { "Moniteur" })
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        return moniteurService.addMoniteur(m);
    }

    // http://localhost:8088/ski/moniteur/remove-moniteur/{moniteur-id}
    @Operation(summary = "Remove moniteur", description = "Remove moniteur", tags = { "Moniteur" })
    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") Long proejtId) {
        moniteurService.removeMoniteur(proejtId);
    }

    // http://localhost:8088/ski/moniteur/modify-moniteur
    @Operation(summary = "Modify moniteur", description = "Modify moniteur", tags = { "Moniteur" })
    @PutMapping("/modify-moniteur")
    public Moniteur modifyMoniteur(@RequestBody Moniteur m) {
        return moniteurService.modifyMoniteur(m);
    }

}
