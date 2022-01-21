package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.persistence.CascadeType;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cares")
public class Care extends BaseEntity{

    @NotEmpty
    @Size(min = 3, max = 50)
	@Column(name = "name", unique = true)
	private String name;

    @NotEmpty
    String description; 

    @NotEmpty
    @ManyToMany(cascade = CascadeType.ALL)
    Set<PetType> compatiblePetTypes;

}
