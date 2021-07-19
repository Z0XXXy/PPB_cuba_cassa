package com.company.cubacassalast.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CUBACASSALAST_STATION")
@Entity(name = "cubacassalast_Station")
@NamePattern("%s|name")
public class Station extends StandardEntity {
    private static final long serialVersionUID = 2474548152842781385L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @JoinTable(name = "CUBACASSALAST_STATION_STATION_LINK",
            joinColumns = @JoinColumn(name = "STATION_1_ID"),
            inverseJoinColumns = @JoinColumn(name = "STATION_2_ID"))
    @ManyToMany
    private List<Station> arrivalStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROUTE_ID")
    private Route route;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public List<Station> getArrivalStations() {
        return arrivalStations;
    }

    public void setArrivalStations(List<Station> arrivalStations) {
        this.arrivalStations = arrivalStations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}