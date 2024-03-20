package com.yourcompany.paris.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;
@Entity
@Getter
@Setter
public class Bookmaker extends Identifiable {
	
	
	@Column(length=50)
    private String pseudo;
	@Column(length=	150)
    private String email;
	@Column(length=50)
	private String password;
	@Column(length=50)
	private Boolean isAdmin =true;
	
	public void definirEvenement(int idEvenement, String nomEvenement, String typeSport) {
       // EvenementSportif ev=new EvenementSportif();
        System.out.println("L'événement " + nomEvenement + " a été défini par ");
    }
	
	public void parametrerEvenement(int idEvenement, double[] cotes, double plafondMise) {}
    
}
