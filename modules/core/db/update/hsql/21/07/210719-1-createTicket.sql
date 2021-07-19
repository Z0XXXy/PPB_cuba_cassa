create table CUBACASSALAST_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(36) not null,
    DEPARTURE_STATION_ID varchar(36) not null,
    DEPARTURE_DATE timestamp not null,
    ARRIVAL_STATION varchar(255) not null,
    ARRIVAL_DATE timestamp not null,
    PASSENGER_ID varchar(36),
    TRANSPORT varchar(50) not null,
    PRICE integer not null,
    TRAVEL_ID varchar(36),
    --
    primary key (ID)
);