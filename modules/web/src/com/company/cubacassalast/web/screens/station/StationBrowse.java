package com.company.cubacassalast.web.screens.station;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Station;

@UiController("cubacassalast_Station.browse")
@UiDescriptor("station-browse.xml")
@LookupComponent("stationsTable")
@LoadDataBeforeShow
public class StationBrowse extends StandardLookup<Station> {
}