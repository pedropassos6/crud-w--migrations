create table tb_order(
    id bigint not null auto_increment,
    user_id bigint not null,
    date_order datetime not null,

    primary key (id)
);

alter table tb_order add constraint fk_tb_order_client
foreign key (user_id) references tb_user (id);