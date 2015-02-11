CREATE TABLE Users (
  user_id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(80) NOT NULL,
  display_name VARCHAR(50) NOT NULL,
  password CHAR(41) NOT NULL,
  PRIMARY KEY (user_id),
  UNIQUE INDEX (email)
) ENGINE=InnoDB;


CREATE TABLE UserProfile (
  user_id INT NOT NULL,
  first_name VARCHAR(25) NOT NULL,
  last_name VARCHAR(25) NOT NULL,
  address VARCHAR(80) NOT NULL,
  city VARCHAR(30) NOT NULL,
  province CHAR(2) NOT NULL,
  postcode CHAR(7) NOT NULL,
  interests TEXT NULL,
  bio TEXT NULL,
  signature TEXT NULL,
  skills TEXT NULL,
  PRIMARY KEY (user_id),
  FULLTEXT KEY (interests, skills)
) ENGINE=MyISAM;


CREATE USER 'dbuser'@'localhost' IDENTIFIED BY 'dbpass';