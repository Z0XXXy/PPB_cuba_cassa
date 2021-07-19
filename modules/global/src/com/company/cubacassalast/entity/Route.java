package com.company.cubacassalast.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CUBACASSALAST_ROUTE")
@Entity(name = "cubacassalast_Route")
@NamePattern("%s|number")
public class Route extends StandardEntity {
    private static final long serialVersionUID = -4833964819016230529L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    private Integer number;

    @OneToMany(mappedBy = "route")
    private List<Station> stations;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

}