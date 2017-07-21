drop table lancamento;

create table lancamento (
	id int,
	motivo varchar(50),
	aprovador varchar(30),
	valor decimal(10,2),
	observacao varchar(255)
);

delete from lancamento;

insert into lancamento values (1, 'TAXI', 'jose.silva', 30, 'Visita ao cliente XPTO');
insert into lancamento values (2, 'TREI', 'jose.silva', 27000, 'Treinamento BPM');
insert into lancamento values (3, 'TAXI', 'maria.regina', 22, 'Taxi do treinamento para casa');

select * from lancamento;