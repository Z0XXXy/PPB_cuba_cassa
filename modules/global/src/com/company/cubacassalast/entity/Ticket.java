package com.company.cubacassalast.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "CUBACASSALAST_TICKET")
@Entity(name = "cubacassalast_Ticket")
@NamePattern("%s|number")
public class Ticket extends StandardEntity {
    private static final long serialVersionUID = -5502444842982297143L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private UUID number;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DEPARTURE_STATION_ID")
    private Station departureStation;

    @NotNull
    @Column(name = "DEPARTURE_DATE", nullable = false)
    private LocalDateTime departureDate;

    @JoinColumn(name = "ARRIVAL_STATION_ID")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Station arrivalStation;

    @NotNull
    @Column(name = "ARRIVAL_DATE", nullable = false)
    private LocalDateTime arrivalDate;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PASSENGER_ID")
    private Passenger passenger;

    @NotNull
    @Column(name = "TRANSPORT", nullable = false)
    private String transport;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRAVEL_ID")
    private Travel travel;

    public void setArrivalStation(Station arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Station getArrivalStation() {
        return arrivalStation;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public KindOfTransport getTransport() {
        return transport == null ? null : KindOfTransport.fromId(transport);
    }

    public void setTransport(KindOfTransport transport) {
        this.transport = transport == null ? null : transport.getId();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public UUID getNumber() {
        return number;
    }

    public void setNumber(UUID number) {
        this.number = number;
    }
}