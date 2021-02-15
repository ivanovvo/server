----------------------------------------------------------------------------- Пользователи
CREATE TABLE "account" (
    "id"              uuid NOT NULL,
    "email"          uuid NULL,

    "passwd"          varchar(256) NULL,

    CONSTRAINT account_pk PRIMARY KEY ("id")

);

create table "name_of_type" (
    "id"                uuid        not null,

    "name"              varchar(15) not null,

    constraint "name_of_type_pk" primary key ("id")
);

create table "photo_of_type" (
    "id"                uuid        not null,
    "animal_id"         uuid        not null,
    "name"              varchar(15) not null,
    "photo"             bytea,

    constraint "photo_of_type_pk" primary key ("id")
);

create table "photo_of_area" (
    "id"                uuid        not null,
    "animal_id"         uuid        not null,
    "name"              varchar(15) not null,
    "photo"             bytea,
     constraint "photo_of_area_pk" primary key ("id")
);


create table "animal_inf" (
    "id"                   uuid not null,
    "name_id"         uuid        not null,
    "type_id"         uuid        not null,
    "area_id"         uuid        not null,
    "inf_of_type"          varchar(2048) not null,
    "inf_of_area"          varchar(2048) not null,
    "inf_of_number"        varchar(2048) not null,
    "inf_of_downsizing"    varchar(2048) not null,
    "inf_of_security"      varchar(2048) not null,

    constraint animal_inf_fk_name_of_type foreign key (name_id) references "name_of_type" (id),
    constraint animal_inf_fk_photo_of_type foreign key (type_id) references "photo_of_type" (id),
    constraint animal_inf_fk_photo_of_area foreign key (area_id) references "photo_of_area" (id),



    constraint "animal_inf_pk" primary key ("id")
);







