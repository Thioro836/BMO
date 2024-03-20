package com.yourcompany.paris.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Parieur  extends Identifiable {

	//@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(length = 15)
	String pseudo;

	@Column(length = 50)
	String nom;

	@Column(length = 50)
	String email;

	@Column(length = 20)
	String password;

	@Column
	double solde;
	
	
}