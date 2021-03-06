DROP DATABASE IF EXISTS Bookstore;

CREATE DATABASE Bookstore;
USE Bookstore;

CREATE TABLE Books(
`IdBook` INT NOT NULL AUTO_INCREMENT,
`AuthorName` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
`AuthorSurname` TEXT
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
`Title`  TEXT
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
`Price` FLOAT,
PRIMARY KEY(`IdBook`))
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;

CREATE TABLE Clients(
`IdClient` INT NOT NULL AUTO_INCREMENT,
`ClientName` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
`ClientSurname` TEXT
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
`Town`  TEXT
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
PRIMARY KEY(`IdClient`))
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;

CREATE TABLE Orders(
`Id` INT NOT NULL AUTO_INCREMENT,
`IdClient` INT NOT NULL,
`IdBook` INT NOT NULL,
`Date` Date,
`Status` VARCHAR(30)
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL ,
PRIMARY KEY(`Id`))
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;


#Insert

INSERT INTO Books (`AuthorName`, `AuthorSurname`, `Title`, `Price`)
VALUES
("Jan", "Miachalak", "Zaawansowane programowanie w PHP", 47.29),
("Andrzej", "Krawczyk", "Windows 10 PL. Zaawansowana administracja systemem", 49.99),
("Paweł", "Jakubowski", "HTML 5. Tworzenie witryn", 53.65),
("Tomasz", "Kowalski", "Urządzenia techniki komputerowej", 34.15),
("Łukasz", "Pasternak", "Java: Tworzenie nowoczesnych stron WWW", 29.99);

INSERT INTO Clients (`ClientName`, `ClientSurname`, `Town`)
VALUES
("Łukasz", "Lewandowski", "Poznań"),
("Jan", "Nowak", "Katowice"),
("Maciej", "Wójcik", "Bydgoszcz"),
("Agnieszka", "Jankowska", "Lublin"),
("Tomasz", "Mazur", "Jelenia Góra"),
("Michał", "Zieliński", "Kraków"),
("Artur", "Rutkowski", "Kielce"),
("Mateusz", "Skorupa", "Gdańsk"),
("Jerzy", "Rutkowski", "Włóżmitu"),
("Anna", "Karenna", "Tumidaj");

INSERT INTO Orders (`IdClient`, `IdBook`, `Date`, `Status`)
VALUES
(2, 4, "2017-10-08", "Oczekiwanie"),
(7, 1, "2017-09-05", "Wyslano"),
(9, 1, "2017-10-11", "Wyslano"),
(2, 2, "2017-10-15", "Oczekiwanie"),
(2, 5, "2017-08-12", "Oczekiwanie"),
(3, 2, "2017-10-20", "Wyslano"),
(4, 3, "2017-08-14", "Wyslano"),
(8, 1, "2017-08-19", "Wyslano"),
(3, 1, "2017-11-19", "Wyslano"),
(9, 2, "2017-12-28", "Oczekiwane");

/*SELECT o.Id, c.ClientName, c.ClientSurname, o.Date
FROM Orders AS o, Client AS c
WHERE o.IdClient = c.IdClient;*/

/*SELECT b.AuthorName, b.AuthorSurname, b.Title FROM BooksAS b, Orders AS o, Clients AS c
WHERE
c.ClientName = "Jan" AND
c.ClientSurname = "Nowak" AND
c.IdClient = o.IdClient AND
o.IdBook = b.IdBook;*/

SELECT c.ClientName, c.ClientSurname, o.Id, o.Date, o. Status, b.Title
FROM
Clients AS c, Orders AS o, Booka AS b
WHERE
c.ClientSurname = "Rutkowski" AND
c.IdClient = o.IdClient AND
o.IdBook = b.IdBook
ORDER BY
o.Date ASC;
