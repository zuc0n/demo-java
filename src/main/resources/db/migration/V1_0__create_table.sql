CREATE TABLE IF NOT EXISTS `brand` (

	`id`   int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(20),
	`slug` varchar(50)
)
	ENGINE = InnoDB
	DEFAULT CHARSET = UTF8;

CREATE TABLE IF NOT EXISTS `product` (

	`id`         int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name`       varchar(20),
	`short_desc` varchar(50),
	`price`      double,
	`stock`      long,
	`sold`       int,
	`brand_id`   int,
	CONSTRAINT FK_product_brand FOREIGN KEY ( brand_id )
		REFERENCES brand( id )
)
	ENGINE = InnoDB
	DEFAULT CHARSET = UTF8;

CREATE TABLE IF NOT EXISTS `review` (

	`id`         int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`user_name`  varchar(20),
	`short_desc` varchar(50),
	`rating`     int,
	`product_id` int,
	CONSTRAINT FK_review_product FOREIGN KEY ( product_id )
		REFERENCES product( id )
)
	ENGINE = InnoDB
	DEFAULT CHARSET = UTF8;

