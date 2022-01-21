package org.springframework.samples.petclinic.care;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "care_provisions")
public class CareProvision extends BaseEntity{   
    
    @NotNull
    @Min(0)
    double duration;

    @Nullable
    @ManyToOne
    Visit visit;

    @ManyToOne
    @NotNull
    Care care;   
}
