package com.company.cubacassalast.web.screens.ticket;

import com.company.cubacassalast.entity.Station;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Ticket;

import javax.inject.Inject;

@UiController("cubacassalast_Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
@LoadDataBeforeShow
public class TicketEdit extends StandardEditor<Ticket> {
    @Inject
    private LookupField<Station> arrivalStationField;
    @Inject
    private PickerField<Station> departureStationField;

    @Subscribe("departureStationField")
    public void onDepartureStationFieldValueChange(HasValue.ValueChangeEvent<Station> event) {
        arrivalStationField.setOptionsList(departureStationField.getValue().getArrivalStations());
    }
}