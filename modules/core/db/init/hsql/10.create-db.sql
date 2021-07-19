-- begin CUBACASSALAST_TICKET
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
    ARRIVAL_STATION_ID varchar(36) not null,
    ARRIVAL_DATE timestamp not null,
    PASSENGER_ID varchar(36),
    TRANSPORT varchar(50) not null,
    PRICE integer not null,
    TRAVEL_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBACASSALAST_TICKET
-- begin CUBACASSALAST_STATION
create table CUBACASSALAST_STATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ROUTE_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBACASSALAST_STATION
-- begin CUBACASSALAST_PASSENGER
create table CUBACASSALAST_PASSENGER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    PASSPORT_SERIAL_NUMBER varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBACASSALAST_PASSENGER
-- begin CUBACASSALAST_ROUTE
create table CUBACASSALAST_ROUTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer not null,
    --
    primary key (ID)
)^
-- end CUBACASSALAST_ROUTE
-- begin CUBACASSALAST_TRAVEL
create table CUBACASSALAST_TRAVEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer not null,
    PASSENGER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBACASSALAST_TRAVEL
-- begin CUBACASSALAST_STATION_STATION_LINK
create table CUBACASSALAST_STATION_STATION_LINK (
    STATION_1_ID varchar(36) not null,
    STATION_2_ID varchar(36) not null,
    primary key (STATION_1_ID, STATION_2_ID)
)^
-- end CUBACASSALAST_STATION_STATION_LINK
