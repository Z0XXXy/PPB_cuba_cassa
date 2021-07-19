package com.company.cubacassalast.web.screens.route;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Route;

@UiController("cubacassalast_Route.browse")
@UiDescriptor("route-browse.xml")
@LookupComponent("routesTable")
@LoadDataBeforeShow
public class RouteBrowse extends StandardLookup<Route> {
}