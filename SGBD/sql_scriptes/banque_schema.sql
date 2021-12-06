DROP Database IF EXISTS `banque`;

CREATE Database banque;
USE banque

DROP TABLE IF EXISTS `comptes`;

CREATE TABLE `comptes` (
  `idcompte` int NOT NULL,
  `solde` float DEFAULT NULL,
  PRIMARY KEY (`idcompte`)
) ENGINE=InnoDB;

LOCK TABLES `comptes` WRITE;

INSERT INTO `comptes` VALUES (1,0),(2,15000),(3,74500),(4,10000);

UNLOCK TABLES;