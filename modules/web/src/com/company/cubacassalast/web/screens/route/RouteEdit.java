package com.company.cubacassalast.web.screens.route;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubacassalast.entity.Route;

@UiController("cubacassalast_Route.edit")
@UiDescriptor("route-edit.xml")
@EditedEntityContainer("routeDc")
@LoadDataBeforeShow
public class RouteEdit extends StandardEditor<Route> {
}