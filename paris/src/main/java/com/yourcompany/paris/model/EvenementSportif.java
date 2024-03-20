package com.yourcompany.paris.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;
@Entity
@Getter 
@Setter
public class EvenementSportif extends Identifiable {
	
	@Column(length=12)
   Date dateEvenement;
	@Column(length=50)
     String heure;
	@Column(length=50)
    String nomEvenement;
	@Column(length=50)
     String typeSport;
	@Column(length=50)
	String cote;
	@Column(length=50)
    double plafondMise;
	

    @ManyToOne
    //@DescriptionsList(descriptionProperties="descriptionBookmaker") // Spécifiez la propriété de description
    Bookmaker bookmaker;
 
   
}
