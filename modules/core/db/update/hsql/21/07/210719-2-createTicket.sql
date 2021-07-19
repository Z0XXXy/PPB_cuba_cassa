alter table CUBACASSALAST_TICKET add constraint FK_CUBACASSALAST_TICKET_ON_DEPARTURE_STATION foreign key (DEPARTURE_STATION_ID) references CUBACASSALAST_STATION(ID);
alter table CUBACASSALAST_TICKET add constraint FK_CUBACASSALAST_TICKET_ON_PASSENGER foreign key (PASSENGER_ID) references CUBACASSALAST_PASSENGER(ID);
alter table CUBACASSALAST_TICKET add constraint FK_CUBACASSALAST_TICKET_ON_TRAVEL foreign key (TRAVEL_ID) references CUBACASSALAST_TRAVEL(ID);
create index IDX_CUBACASSALAST_TICKET_ON_DEPARTURE_STATION on CUBACASSALAST_TICKET (DEPARTURE_STATION_ID);
create index IDX_CUBACASSALAST_TICKET_ON_PASSENGER on CUBACASSALAST_TICKET (PASSENGER_ID);
create index IDX_CUBACASSALAST_TICKET_ON_TRAVEL on CUBACASSALAST_TICKET (TRAVEL_ID);
