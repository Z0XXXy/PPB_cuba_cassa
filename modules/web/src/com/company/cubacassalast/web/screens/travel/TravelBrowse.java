package com.company.cubacassalast.web.screens.travel;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Travel;

@UiController("cubacassalast_Travel.browse")
@UiDescriptor("travel-browse.xml")
@LookupComponent("travelsTable")
@LoadDataBeforeShow
public class TravelBrowse extends StandardLookup<Travel> {
}