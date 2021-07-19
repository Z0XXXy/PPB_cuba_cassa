package com.company.cubacassalast.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Ticket;

@UiController("cubacassalast_Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
@LoadDataBeforeShow
public class TicketBrowse extends StandardLookup<Ticket> {
}