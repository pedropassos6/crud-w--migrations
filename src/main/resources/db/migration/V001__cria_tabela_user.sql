create table tb_user(
    id bigint not null auto_increment,
    name varchar (60) not null,
    email varchar(255) not null,
    phone varchar(20) not null,
    password varchar(20),

    primary key (id)
);

alter table tb_user
add constraint uk_tb_user unique (email);