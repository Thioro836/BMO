package com.yourcompany.paris.model;
import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Sport  extends Identifiable {
	@Column(length = 50)
	String nomSport;
	@Column(length = 50)
	String regleSport;
}
