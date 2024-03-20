package com.yourcompany.paris.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;
	@Entity
	@Getter @Setter
	
public class Paris  extends Identifiable {
		
	@Column(length=50)
    private String nomParieur;
	@Embedded
	TypePari typePari;
	@Column(length=50)
    private String ResultatPari;
	@Column(length=50)
    private double solde;
	@Column(length=50)
	
    private String evenement;
	@ManyToOne 
	//@DescriptionsList  
	private Parieur parieur;
	@ManyToOne
	//@DescriptionsList  
	private EvenementSportif evenementSportif;
	
	
}

	
	
