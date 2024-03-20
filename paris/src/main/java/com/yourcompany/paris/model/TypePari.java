package com.yourcompany.paris.model;

import javax.persistence.*;

import lombok.*;
@Embeddable 
@Getter @Setter
public class TypePari {
	
	@Column 
	String libelle;
	@Column
	String optionPari;

}
