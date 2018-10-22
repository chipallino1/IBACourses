alter table festival_db.contacts add foreign key (id_member) references festival_db.members(Id);

alter table festival_db.contacts add foreign key (id_subscriber) references festival_db.subscribers(Id);

alter table festival_db.subscribers add foreign key (id_password) references festival_db.passwords(Id);

alter table festival_db.subscribers_on_events add foreign key (id_subscriber) references festival_db.subscribers(Id);


alter table festival_db.subscribers_on_events add foreign key (id_event) references festival_db.events(Id);

alter table festival_db.events add foreign key (id_places) references festival_db.places(Id);

alter table festival_db.members_on_events add foreign key (id_member) references festival_db.members(Id);

alter table festival_db.members_on_events add foreign key (id_event) references festival_db.events(Id);