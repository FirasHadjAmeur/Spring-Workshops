package com.example.demo.Controllers;


import com.example.demo.Entity.Skieur;
import com.example.demo.Interfaces.ISkieurService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieur")
@Tag(name = "Skieur Management", description = "API for Skieur")
public class SkieurRestController {
    @Autowired
    ISkieurService skieurService;

    // http://localhost:8088/ski/skieur/retrieve-all-skieurs
    @Operation(summary = "Get all skieurs", description = "Get all skieurs", tags = { "Skieur" })
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieurs() {
        return skieurService.retrieveAllSkieurs();
    }

    // http://localhost:8088/ski/skieur/retrieve-skieur/8
    @Operation(summary = "Get skieur by id", description = "Get skieur by id", tags = { "Skieur" })
    @GetMapping("/retrieve-skieur/{skieur-id}")
    public Skieur retrieveSkieur(@PathVariable("skieur-id") Long proejtId) {
        return skieurService.retrieveSkieur(proejtId);
    }

    // http://localhost:8088/ski/skieur/add-skieur
    @Operation(summary = "Add skieur", description = "Add skieur", tags = { "Skieur" })
    @PostMapping("/add-skieur")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return skieurService.addSkieur(s);
    }

    // http://localhost:8088/ski/skieur/remove-skieur/{skieur-id}
    @Operation(summary = "Remove skieur", description = "Remove skieur", tags = { "Skieur" })
    @DeleteMapping("/remove-skieur/{skieur-id}")
    public void removeSkieur(@PathVariable("skieur-id") Long proejtId) {
        skieurService.removeSkieur(proejtId);
    }

    // http://localhost:8088/ski/skieur/modify-skieur
    @Operation(summary = "Modify skieur", description = "Modify skieur", tags = { "Skieur" })
    @PutMapping("/modify-skieur")
    public Skieur modifySkieur(@RequestBody Skieur s) {
        return skieurService.modifySkieur(s);
    }

}
