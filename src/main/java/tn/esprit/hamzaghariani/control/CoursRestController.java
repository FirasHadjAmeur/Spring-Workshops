package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Cours;
import tn.esprit.hamzaghariani.services.ICoursService;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursRestController {
    @Autowired
    ICoursService coursService;

    // http://localhost:8089/ski/cours/retrieve-all-cours
    @GetMapping("/retrieve-all-cours")
    public List<Cours> getCours() {
        List<Cours> listCours = coursService.retrieveAllCours();
        return listCours;
    }
    // http://localhost:8089/ski/cours/retrieve-cours/8
    @GetMapping("/retrieve-cours/{cours-id}")
    public Cours retrieveCours(@PathVariable("cours-id") int coursId) {
        Cours cours = coursService.retrieveCours(coursId);
        return cours;
    }
    // http://localhost:8089/ski/cours/add-cours
    @PostMapping("/add-cours")
    public Cours addCours(@RequestBody Cours c) {
        Cours cours = coursService.addCours(c);
        return cours;
    }
    // http://localhost:8089/ski/cours/remove-cours/{cours-id}
    @DeleteMapping("/remove-cours/{cours-id}")
    public void removeCours(@PathVariable("cours-id") int coursId) {
        coursService.removeCours(coursId);
    }
    // http://localhost:8089/ski/cours/modify-cours
    @PutMapping("/modify-cours")
    public Cours modifyCours(@RequestBody Cours cours) {
        Cours updatedCours = coursService.modifyCours(cours);
        return updatedCours;
    }
}
