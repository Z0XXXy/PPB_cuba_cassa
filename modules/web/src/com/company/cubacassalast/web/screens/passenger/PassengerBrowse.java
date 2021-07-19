package com.company.cubacassalast.web.screens.passenger;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Passenger;

@UiController("cubacassalast_Passenger.browse")
@UiDescriptor("passenger-browse.xml")
@LookupComponent("passengersTable")
@LoadDataBeforeShow
public class PassengerBrowse extends StandardLookup<Passenger> {
}