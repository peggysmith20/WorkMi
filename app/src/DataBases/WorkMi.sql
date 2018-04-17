CREATE TABLE `workMi_iD`(
`wMi_iD` VARCHAR(20) NOT NULL,
PRIMARY KEY (`wMi_iD`)
)

CREATE TABLE `users`(
`Employee_Id` = INT(10) NOT NULL,
`Rank`        = BIT (1),
`First_Name`  = VARCHAR (32) DEFAULT Null,
`Last_Name`   = VARCHAR (32) DEFAULT NULL,
`Pass_Word `  = VARCHAR (32) DEFAULT NULL,
`EMail`       = VARCHAR (32) DEFAULT Null,

)