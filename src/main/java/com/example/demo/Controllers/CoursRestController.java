package com.example.demo.Controllers;


import com.example.demo.Entity.Cours;
import com.example.demo.Interfaces.ICoursService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
@Tag(name = "Cours Management", description = "API for Cours")
public class CoursRestController {

    @Autowired
    ICoursService coursService;

    // http://localhost:8088/ski/cours/retrieve-all-cours
    @Operation(summary = "Get all cours", description = "Get all cours", tags = { "Cours" })
    @GetMapping("/retrieve-all-cours")
    public List<Cours> getCours() {
        return coursService.retrieveAllCours();
    }

    // http://localhost:8088/ski/cours/retrieve-cours/8
    @Operation(summary = "Get cours by id", description = "Get cours by id", tags = { "Cours" })
    @GetMapping("/retrieve-cours/{cours-id}")
    public Cours retrieveCours(@PathVariable("cours-id") Long coursId) {
        return coursService.retrieveCours(coursId);
    }

    // http://localhost:8088/ski/cours/add-cours
    @Operation(summary = "Add cours", description = "Add cours", tags = { "Cours" })
    @PostMapping("/add-cours")
    public Cours addCours(@RequestBody Cours c) {
        return coursService.addCours(c);
    }

    // http://localhost:8088/ski/cours/remove-cours/{cours-id}
    @Operation(summary = "Remove cours", description = "Remove cours", tags = { "Cours" })
    @DeleteMapping("/remove-cours/{cours-id}")
    public void removeCours(@PathVariable("cours-id") Long coursId) {
        coursService.removeCours(coursId);
    }

    // http://localhost:8088/ski/cours/modify-cours
    @Operation(summary = "Modify cours", description = "Modify cours", tags = { "Cours" })
    @PutMapping("/modify-cours")
    public Cours modifyCours(@RequestBody Cours c) {
        return coursService.modifyCours(c);
    }
}
