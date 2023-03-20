package com.example.demo.Controllers;

import com.example.demo.Entity.Abonnement;
import com.example.demo.Interfaces.IAbonnementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonnement")
@Tag(name = "Abonnement Management", description = "API for Abonnement")
public class AbonnementRestController {

    @Autowired
    IAbonnementService abonnementService;

    // http://localhost:8088/ski/abonnement/retrieve-all-abonnements
    @Operation(summary = "Get all abonnements", description = "Get all abonnements", tags = { "Abonnement" })
    @GetMapping("/retrieve-all-abonnements")
    public List<Abonnement> getAbonnements() {
        return abonnementService.retrieveAllAbonnements();
    }

    // http://localhost:8088/ski/abonnement/retrieve-abonnement/8
    @Operation(summary = "Get abonnement by id", description = "Get abonnement by id", tags = { "Abonnement" })
    @GetMapping("/retrieve-abonnement/{abonnement-id}")
    public Abonnement retrieveAbonnement(@PathVariable("abonnement-id") Long abonnementId) {
        return abonnementService.retrieveAbonnement(abonnementId);
    }

    // http://localhost:8088/ski/abonnement/add-abonnement
    @Operation(summary = "Add abonnement", description = "Add abonnement", tags = { "Abonnement" })
    @PostMapping("/add-abonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement a) {
        return abonnementService.addAbonnement(a);
    }

    // http://localhost:8088/ski/abonnement/remove-abonnement/{abonnement-id}
    @Operation(summary = "Remove abonnement", description = "Remove abonnement", tags = { "Abonnement" })
    @DeleteMapping("/remove-abonnement/{abonnement-id}")
    public void removeAbonnement(@PathVariable("abonnement-id") Long abonnementId) {
        abonnementService.removeAbonnement(abonnementId);
    }

    // http://localhost:8088/ski/abonnement/modify-abonnement
    @Operation(summary = "Modify abonnement", description = "Modify abonnement", tags = { "Abonnement" })
    @PutMapping("/modify-abonnement")
    public Abonnement modifyAbonnement(@RequestBody Abonnement a) {
        return abonnementService.modifyAbonnement(a);
    }
}
