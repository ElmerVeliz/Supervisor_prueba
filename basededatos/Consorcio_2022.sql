create database Consorcio_2022;
use Consorcio_2022;
create table tb_supervisor
(
cod_supervisor int primary key auto_increment,
nom_supervisor varchar(50),
ape_supervisor varchar(50),
dni_supervisor int,
celular_supervisor int
)
select*from tb_supervisor;
drop table tb_supervisor;
