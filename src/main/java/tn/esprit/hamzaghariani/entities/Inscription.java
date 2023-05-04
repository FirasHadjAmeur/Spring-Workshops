package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Inscription" )
public class Inscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idInscription" )
    private Integer idInscription;
    private Long numInscription;
    private  Integer numSemaine;
    // Bidirectionelle *-1 avec skieur
    @ManyToOne
    Skieur skieur;
    // Bidirectionelle *-1 avec cours
    @ManyToOne
    Cours cours;
}
