package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Couleur;
import tn.esprit.hamzaghariani.entities.Piste;
import tn.esprit.hamzaghariani.services.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteRestController {
    @Autowired
    IPisteService pisteService;
    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes() {
        List<Piste> listPistes = pisteService.retrieveAllPistes();
        return listPistes;
    }
    // http://localhost:8089/ski/piste/retrieve-piste/8
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") int proejtId) {
        Piste piste = pisteService.retrievePiste(proejtId);
        return piste;
    }
    // http://localhost:8089/ski/piste/add-piste
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = pisteService.addPiste(p);
        return piste;
    }
    // http://localhost:8089/ski/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") int proejtId) {
        pisteService.removePiste(proejtId);
    }
    // http://localhost:8089/ski/piste/modify-piste
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        Piste piste = pisteService.modifyPiste(p);
        return piste;
    }
    @GetMapping("/pistes/couleur/{couleur}")
    public List<Piste> getPistesByCouleur(@PathVariable Couleur couleur) {
        return pisteService.recupererPistesSelonCouleur(couleur);
    }

    @GetMapping("/pistes/{pente}/{longeur}")
    public ResponseEntity<List<Piste>> getPistesByPenteAndLongueur(@PathVariable int pente, @PathVariable int longeur) {
        List<Piste> pistes = pisteService.recupererPistesSelonPenteEtLongueur(pente, longeur);
        return ResponseEntity.ok(pistes);
    }


}
