create table CUBACASSALAST_STATION_STATION_LINK (
    STATION_1_ID varchar(36) not null,
    STATION_2_ID varchar(36) not null,
    primary key (STATION_1_ID, STATION_2_ID)
);
