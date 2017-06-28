/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-
 * Created: 30/05/2017
 */

create table direccion(id integer primary key auto_increment,numero integer,calle varchar(40),cp integer,municipio varchar(40));

select * from direccion;

create table salaCine(id_sala integer primary key,tituloPelicula varchar (80),clasificacion varchar(20),num_asientos integer);
create table boleto(id_boleto integer primary key auto_increment,sid_sala integer,costoBoleto float, 
                     foreign key (sid_sala) references salaCine(id_sala));

describe salaCine;