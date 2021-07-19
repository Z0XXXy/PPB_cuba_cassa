package com.company.cubacassalast.web.screens.station;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Station;

@UiController("cubacassalast_Station.edit")
@UiDescriptor("station-edit.xml")
@EditedEntityContainer("stationDc")
@LoadDataBeforeShow
public class StationEdit extends StandardEditor<Station> {
}