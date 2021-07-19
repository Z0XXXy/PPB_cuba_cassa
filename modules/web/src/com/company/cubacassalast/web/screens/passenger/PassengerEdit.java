package com.company.cubacassalast.web.screens.passenger;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Passenger;

@UiController("cubacassalast_Passenger.edit")
@UiDescriptor("passenger-edit.xml")
@EditedEntityContainer("passengerDc")
@LoadDataBeforeShow
public class PassengerEdit extends StandardEditor<Passenger> {
}