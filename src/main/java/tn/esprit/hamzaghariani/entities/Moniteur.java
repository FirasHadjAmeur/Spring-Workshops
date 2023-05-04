package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Moniteur" )
public class Moniteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idMoniteur" )
    private Integer idMoniteur;
    private  Long numMoniteur;
    private  String nomM;
    private  String prenomM;
    private Date dateRecru;
    // One To Many Unidirectionnelle avec cours
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;
}
