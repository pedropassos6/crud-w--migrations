create table tb_order(
    id bigint not null auto_increment,
    client_id bigint not null,
    date_order datetime not null,

    primary key (id),
    foreign key (client_id) references tb_user(id)
);