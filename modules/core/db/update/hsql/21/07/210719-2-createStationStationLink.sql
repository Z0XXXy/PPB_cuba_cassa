alter table CUBACASSALAST_STATION_STATION_LINK add constraint FK_STASTA_ON_STATION_1 foreign key (STATION_1_ID) references CUBACASSALAST_STATION(ID);
alter table CUBACASSALAST_STATION_STATION_LINK add constraint FK_STASTA_ON_STATION_2 foreign key (STATION_2_ID) references CUBACASSALAST_STATION(ID);