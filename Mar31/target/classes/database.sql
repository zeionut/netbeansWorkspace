/* 
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Author:  svilupposw
 * Created: 31-mar-2016
 */


drop database if exists `mar31`;

create database `mar31` default charset=utf8;

use `mar31`;

create table `cliente` (
    `id` integer auto_increment primary key,
    `nome` varchar(255) not null,
    `cognome` varchar(255) not null
) engine = InnoDB;

insert into `cliente` (`nome`, `cognome`)
    values ('Filippo', 'Cocchia');

insert into `cliente` (`nome`, `cognome`)
    values ('Cristina', 'Gedda');

insert into `cliente` (`nome`, `cognome`)
    values ('Lucio', 'Crusca');

insert into `cliente` (`nome`, `cognome`)
    values ('Laura', 'Periale');

insert into `cliente` (`nome`, `cognome`)
    values ('Fabio', 'Moro');

insert into `cliente` (`nome`, `cognome`)
    values ('Yuri', 'Rocchi');

insert into `cliente` (`nome`, `cognome`)
    values ('Matteo', 'Candeliere');

insert into `cliente` (`nome`, `cognome`)
    values ('Mattia', 'Busso');

insert into `cliente` (`nome`, `cognome`)
    values ('Sergio', 'Frasso');

insert into `cliente` (`nome`, `cognome`)
    values ('Dorio', 'Solfino');
