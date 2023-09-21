

create database sampleDB2022;
use sampleDB2022 ;

drop table clubs;

CREATE TABLE Clubs (
  ClubID	int NOT NULL,
  ClubName varchar(50) NOT NULL default 'charity',
  PRIMARY KEY  (ClubID)
);


INSERT INTO Clubs (ClubID, ClubName) VALUES (1, 'SUZA Youthmappers');
INSERT INTO Clubs (ClubID, ClubName) VALUES (2, 'SUZA Apps Club');
INSERT INTO Clubs (ClubID, ClubName) VALUES (3, 'SUZA Multimedia and Animation Club');
INSERT INTO Clubs (ClubID, ClubName) VALUES (4, 'SUZA Python Club');
INSERT INTO Clubs (ClubID, ClubName) VALUES (5, 'Google Developers Club');
INSERT INTO Clubs (ClubID, ClubName) VALUES (6, 'SUZA English Club');
INSERT INTO Clubs (ClubID, ClubName) VALUES (7, 'SUZA Environment Club');

CREATE TABLE Leaders (
  LeaderID int NOT NULL default '0',
  LeaderName char(20) NOT NULL default '',
  Street char(20) NOT NULL default '',
  City char(15) NOT NULL default '',
  State char(2) NOT NULL default '',
  Zip int NOT NULL default '0',
  ClubID int default '0',
  PRIMARY KEY  (LeaderID),
  FOREIGN KEY(ClubID) REFERENCES Clubs(ClubID));



INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(1, 'Mudathir Salum', 'Main St', 'Scranton', 'PA', 43243, 3);
INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(2, 'Ahmad Sadri', '42 Street', 'New York', 'NY', 54354, 2);
INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(3, 'Amina Suleiman', '1 Mud Slide Slim', 'Boston', 'MA', 83432, 5);
INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(4, 'Muhammed Bakari', 'Sinatra Way', 'New York', 'NY', 42432, 1);
INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(5, 'Sharifa Soud', 'Left His Heart', 'San Francisco', 'CA', 43243, 7);
INSERT INTO Leaders (LeaderID, LeaderName, Street, City, State, Zip, ClubID) VALUES 
(7, 'Madina Makame', 'WastingA Way', 'Margaritaville', 'FL', 21323, 3);








CREATE TABLE Venues (
  VenueID int NOT NULL,
  VenueName char(20) NOT NULL default '',
  City char(15) NOT NULL default '',
  VenueCapacity int NOT NULL default '0',
  PRIMARY KEY  (VenueID)
);




INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (1, 'Maruhubi', 'Pittsburgh', 18200);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (2, 'Kizimbani', 'Columbia', 12000);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (3, 'Tunguu Main Hall', 'Annapolis', 6000);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (4, 'Chwaka hall', 'New York', 4400);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (5, 'Mbweni main Hall', 'Cincinnati', 21000);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (6, 'Vuga Hall', 'Charlotte', 24000);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (7, 'Betrasi', 'Roanoke', 8900);
INSERT INTO Venues (VenueID, VenueName, City, VenueCapacity) VALUES (8, 'Kilimani Hall', 'Washington', 21242);



CREATE TABLE Event (
  LeaderID int NOT NULL default '0',
  VenueID int NOT NULL default '0',
  EventDate date NOT NULL default '2006-01-01',
  TicketPrice int NOT NULL,
  PRIMARY KEY  (LeaderID,VenueID),
  FOREIGN KEY (LeaderID) REFERENCES Leaders(LeaderID),
  FOREIGN KEY (VenueID) REFERENCES Venues(VenueID)
);




INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (1, 4, '2005-06-12', '25');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (1, 7, '2005-09-21', '23');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (1, 1, '2005-09-17', '32');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (1, 6, '2005-09-11', '25');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (2, 2, '2005-08-11', '21');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (2, 4, '2005-09-18', '26');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (2, 5, '2005-09-21', '22');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (2, 7, '2005-09-11', '31');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (3, 1, '2005-09-11', '22');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (3, 2, '2005-09-16', '21');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (3, 4, '2005-09-01', '29');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (4, 4, '2005-09-11', '31');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (4, 5, '2005-09-17', '24');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (4, 6, '2005-09-18', '17');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (5, 2, '2005-09-11', '22');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (5, 4, '2005-09-18', '31');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (5, 6, '2005-09-01', '25');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (7, 2, '2005-09-11', '21');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (7, 4, '2005-09-18', '31');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (7, 7, '2005-09-01', '28');
INSERT INTO Event (LeaderID, VenueID, EventDate, TicketPrice) VALUES (7, 6, '2005-09-16', '25');