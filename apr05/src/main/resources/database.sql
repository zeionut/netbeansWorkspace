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

/**
* mysql -h 127.0.0.1 -u root < database.sql
**/

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
    values ('Dario', 'Solfino');

create table `note` (
    `id` integer auto_increment primary key,
    `titolo` varchar(255) not null,
    `testo` text not null,
    `data` date not null,
    `cliente` integer not null
) engine = InnoDB;

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Ciao a tutti', 'Ciao a tutti come state io sto bene', '2016-04-01', 1 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Pesce', 'Oggi è pesce di aprile', '2016-04-01', 2 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Carote', 'A me piacciono le carte e a voi', '2016-04-01', 3 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Sono qui', 'Io sono qui per rompere le canzoncine', '2016-04-01', 4 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Uomo topo', 'Non sono uno uomo topo anche se le mio orcchie dicono il contrario',
 '2016-04-01', 5 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Gioco non gioco', 'Gioco ma non gioco', '2016-04-01', 6 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Leggo', 'Io leggo e porto in giro un libro per farlo vedere', '2016-04-01', 7 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('D and D', 'Giocare duro giocare sempre', '2016-04-01', 8 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Non esisto', 'Sono una persona fittizia creata per imparare', '2016-04-01', 9 );

insert into `note` (`titolo`, `testo`, `data`, `cliente`)
    values ('Anche io', 'Infine anche io non sono vero ma creato per imparare', '2016-04-01', 9 );
