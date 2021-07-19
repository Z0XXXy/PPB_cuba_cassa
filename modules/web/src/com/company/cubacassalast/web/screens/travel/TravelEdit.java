package com.company.cubacassalast.web.screens.travel;

import com.company.cubacassalast.entity.Passenger;
import com.company.cubacassalast.entity.Ticket;
import com.company.cubacassalast.web.screens.ticket.TicketEdit;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Travel;

import javax.inject.Inject;

@UiController("cubacassalast_Travel.edit")
@UiDescriptor("travel-edit.xml")
@EditedEntityContainer("travelDc")
@LoadDataBeforeShow
public class TravelEdit extends StandardEditor<Travel> {
    @Inject
    private CollectionLoader<Ticket> ticketsDl;
    @Inject
    private PickerField<Passenger> passengerField;
    @Inject
    private InstanceContainer<Travel> travelDc;
    @Inject
    private CollectionContainer<Ticket> ticketsDc;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Travel> event) {
        ticketsDl.setParameter("id",event.getEntity().getId());
        ticketsDl.load();
    }
    @Install(to="ticketsTable.create",subject = "screenConfigurer")
    protected void ticketsTableScreenConfigurer(Screen editorScreen){
        if(passengerField.getValue()!=null) {
            ((TicketEdit) editorScreen).getEditedEntity().setPassenger(passengerField.getValue());
        }
        if(travelDc.getItemOrNull()!=null)
            ((TicketEdit) editorScreen).getEditedEntity().setTravel(travelDc.getItem());
        if(!ticketsDc.getItems().isEmpty())
            ((TicketEdit) editorScreen).getEditedEntity().setDepartureStation(ticketsDc.getItems().get(ticketsDc.getItems().size()-1).getArrivalStation());
    }

}