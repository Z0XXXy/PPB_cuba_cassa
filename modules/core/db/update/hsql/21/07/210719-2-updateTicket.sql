alter table CUBACASSALAST_TICKET alter column ARRIVAL_STATION rename to ARRIVAL_STATION__U78218 ^
alter table CUBACASSALAST_TICKET alter column ARRIVAL_STATION__U78218 set null ;
-- alter table CUBACASSALAST_TICKET add column ARRIVAL_STATION_ID varchar(36) ^
-- update CUBACASSALAST_TICKET set ARRIVAL_STATION_ID = <default_value> ;
-- alter table CUBACASSALAST_TICKET alter column ARRIVAL_STATION_ID set not null ;
alter table CUBACASSALAST_TICKET add column ARRIVAL_STATION_ID varchar(36) not null ;
