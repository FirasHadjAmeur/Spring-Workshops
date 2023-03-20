package com.example.demo.Services;


import com.example.demo.Entity.Cours;
import com.example.demo.Interfaces.ICoursService;
import com.example.demo.Repository.CoursRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService implements ICoursService {
    @Autowired
    CoursRepoitory coursRepository;
    public List<Cours> retrieveAllCours() {
        return (List<Cours>) coursRepository.findAll();
    }

    public Cours retrieveCours(Long coursId) {
        return coursRepository.findById(coursId).get();
    }

    public Cours addCours(Cours c) {
        return coursRepository.save(c);
    }

    public void removeCours(Long coursId) {
        coursRepository.deleteById(coursId);
    }

    public Cours modifyCours(Cours cours) {
        return coursRepository.save(cours);
    }
}
