DROP DATABASE IF EXISTS Bookstore;
CREATE DATABASE Bookstore;
USE Bookstore;
CREATE TABLE Books(
`IdBook` INT NOT NULL AUTO_INCREMENT,
`AuthorName` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`AuthorSurname` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`Title` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`Price` FLOAT NOT NULL,
PRIMARY KEY (`IdBook`))
DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

CREATE TABLE Clients( 
`IdClient` INT NOT NULL AUTO_INCREMENT,
`ClientName` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`ClientSurname` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`Town` TEXT CHARACTER SET utf8 COLLATE utf8_polish_ci,
PRIMARY KEY (`IdClient`))
DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

CREATE TABLE Orders(
`Id` INT NOT NULL AUTO_INCREMENT,
`IdClient` INT NOT NULL,
`IdBook` INT NOT NULL,
`Date` DATE,
`Status` VARCHAR(30)CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
PRIMARY KEY (`Id`))
DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

INSERT INTO Books(`AuthorName`, `AuthorSurname`, `Title`, `Price`)
VALUES 
("Jan", "Michalak", "Zaawansowane programowanie w PHP", 47.29),
("Andrzej", "Krawczyk", "WINDOWS 10PL Zaawansowana administracja systemu", 49.99),
("Paweł", "Jakubowski", "HTML5. Tworzenie witryn.", 53.65),
("Tomasz", "Kowalski", "Urządzenie techniki komuterowej", 34.15),
("Łukasz", "Pasternak", "JAVA. Tworzenie nowoczesnych stron WWW", 29.99);

INSERT INTO Clients(`ClientName`, `ClientSurname`, `Town`)
VALUES
("Łukasz", "Lewandowski", "Poznań"),
("Jan", "Nowak", "Katowice"),
("Maciej", "Wójcik", "Bydgoszcz"),
("Agnieszka", "Jankowska", "Lublin"),
("Tomasz", "Mazur", "Jelenie Góra"),
("MIchał", "Zieliński", "Kraków"),
("Artur", "Rutkowski", "Kielce"),
("Mateusz", "Skorupa", "Gdańsk"),
("Tomasz", "Rutkowski", "Tumiwłóż"),
("Anna", "Karenna", "Tumidaj");

INSERT INTO Orders (`IdClient`, `IdBook`, `Date`, `Status`)
VALUES 
(2,4,"2017-10-08","Oczekiwanie"),
(7,1,"2017-09-05", "Wysłano"),
(9,1,"2017-11-10","Wysłano"),
(2,2,"2017-10-15", "Oczekuje"),
(3,2,"2017-10-20", "Wysłano"),
(4,3,"2017-08-15","Wysłano"),
(8,1,"2017-08-19", "Wysłąno"),
(3,1,"2017-11-19", "Wysłano"),
(9,2,"2017-12-28", "Oczekuja");


SELECT o.Id, c.ClientName, c.ClientSurname, o.Date FROM Orders AS o, Clients AS c  WHERE o.IdClient=c.IdClient





