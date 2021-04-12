----------------------------------------------------------------------------- Пользователи
CREATE TABLE "account" (
    "id"              integer  NULL,
    "login"          varchar(256)  NULL,
    "password"          varchar(256)  NULL,

    CONSTRAINT "account_pk" PRIMARY KEY ("id")

);

create table "name_of_type" (
    "id"                integer        not null,
    "name"              varchar(15) not null,

    constraint "name_of_type_pk" primary key ("id")
);

create table "photo_of_type" (
    "id"                 integer        not null,
    "animal_id"          varchar(256)        not null,
    "name"              varchar(15) not null,
    "photo"             bytea,

    constraint "photo_of_type_pk" primary key ("id")
);

create table "photo_of_area" (
    "id"                  integer         not null,
    "animal_id"          varchar(256)        not null,
    "name"              varchar(15) not null,
    "photo"             bytea,
     constraint "photo_of_area_pk" primary key ("id")
);


create table "animal_inf" (
    "id"                   integer not null,
    "name_id"          integer        not null,
    "type_id"          integer        not null,
    "area_id"         integer        not null,
    "inf_of_type"          varchar(2048) not null,
    "inf_of_area"          varchar(2048) not null,
    "inf_of_number"        varchar(2048) not null,
    "inf_of_downsizing"    varchar(2048) not null,
    "inf_of_security"      varchar(2048) not null,

    constraint "animal_inf_pk" primary key ("id")


);









