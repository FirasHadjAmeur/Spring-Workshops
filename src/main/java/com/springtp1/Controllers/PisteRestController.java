package com.springtp1.Controllers;

import com.springtp1.Entity.Piste;
import com.springtp1.Interfaces.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteRestController {
    @Autowired
    IPisteService pisteService;
    // http://localhost:8088/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes() {
        return pisteService.retrieveAllPistes();
    }
    // http://localhost:8089/ski/piste/retrieve-piste/8
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") Long proejtId) {
        return pisteService.retrievePiste(proejtId);
    }
    // http://localhost:8089/ski/piste/add-piste
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        return pisteService.addPiste(p);
    }
    // http://localhost:8089/ski/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Long proejtId) {
        pisteService.removePiste(proejtId);
    }
    // http://localhost:8089/ski/piste/modify-piste
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        return pisteService.modifyPiste(p);
    }
}