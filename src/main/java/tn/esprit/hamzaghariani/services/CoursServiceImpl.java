package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Cours;
import tn.esprit.hamzaghariani.repository.CoursRepository;

import java.util.List;

@Service
public class CoursServiceImpl implements ICoursService {

    @Autowired
    private CoursRepository coursRepository;

    @Override
    public List<Cours> retrieveAllCours() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours retrieveCours(int coursId) {
        return coursRepository.findById(coursId).orElse(null);
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void removeCours(int coursId) {
        coursRepository.deleteById(coursId);
    }

    @Override
    public Cours modifyCours(Cours cours) {
        return coursRepository.save(cours);
    }
}
