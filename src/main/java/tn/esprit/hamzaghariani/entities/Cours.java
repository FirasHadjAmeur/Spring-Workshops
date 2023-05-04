package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Cours" )
public class Cours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idCours" )
    private Integer idCours;
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCour;
    @Enumerated(EnumType.STRING)
    private Support sp;
    private Float prix;
    private  Integer creneau;
    // Bidirectionelle *-1 avec inscription
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private Set<Inscription> inscriptions;

}
