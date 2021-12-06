create table Author (
    id  integer auto_increment PRIMARY KEY,
	`Author` varchar(100) UNIQUE ,
	Author_name varchar(200) DEFAULT NULL,
	`Author_Description` varchar(500) DEFAULT NULL,
	`Author_Statuses_Count` double DEFAULT NULL,
	`Author_Favourites_Count` double DEFAULT NULL,
	`Author_Friends_Count` double DEFAULT NULL,
	`Author_Followers_Count` double DEFAULT NULL,
	`Author_Listed_Count` double DEFAULT NULL,
	`Author_Verified` varchar(100) DEFAULT NULL
)ENGINE = InnoDB;
