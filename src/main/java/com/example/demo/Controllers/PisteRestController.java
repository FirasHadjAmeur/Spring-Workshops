package com.example.demo.Controllers;

import com.example.demo.Entity.Piste;
import com.example.demo.Interfaces.IPisteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piste")
@Tag(name = "Piste Management", description = "API for Piste")
public class PisteRestController {
    @Autowired
    IPisteService pisteService;
    // http://localhost:8088/ski/piste/retrieve-all-pistes
    @Operation(summary = "Get all pistes", description = "Get all pistes", tags = { "Piste" })
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes() {
        return pisteService.retrieveAllPistes();
    }

    // http://localhost:8088/ski/piste/retrieve-piste/8
    @Operation(summary = "Get piste by id", description = "Get piste by id", tags = { "Piste" })
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") Long proejtId) {
        return pisteService.retrievePiste(proejtId);
    }

    // http://localhost:8088/ski/piste/add-piste
    @Operation(summary = "Add piste", description = "Add piste", tags = { "Piste" })
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        return pisteService.addPiste(p);
    }

    // http://localhost:8088/ski/piste/remove-piste/{piste-id}
    @Operation(summary = "Remove piste", description = "Remove piste", tags = { "Piste" })
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Long proejtId) {
        pisteService.removePiste(proejtId);
    }

    // http://localhost:8088/ski/piste/modify-piste
    @Operation(summary = "Modify piste", description = "Modify piste", tags = { "Piste" })
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        return pisteService.modifyPiste(p);
    }
}