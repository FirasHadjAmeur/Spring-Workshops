package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table ( name = "Piste" )
public class Piste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column( name = "idPiste" )
    private Integer idPiste;
    private  Long numPiste;
    private  String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private  Integer longeur;
    private Integer pente;
    // Biderectionelle Relation *-* avec skieur
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieurs;
}