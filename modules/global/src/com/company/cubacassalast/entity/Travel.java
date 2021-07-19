package com.company.cubacassalast.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CUBACASSALAST_TRAVEL")
@Entity(name = "cubacassalast_Travel")
@NamePattern("%s|number")
public class Travel extends StandardEntity {
    private static final long serialVersionUID = 4424637057838769734L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PASSENGER_ID")
    private Passenger passenger;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "travel")
    private List<Ticket> tickets;

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}