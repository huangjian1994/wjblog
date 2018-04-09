CREATE TABLE `NewTable` (
`id`  varchar(40) NOT NULL ,
`title`  varchar(255) DEFAULT NULL ,
`content`  text ,
`textcontent`  text ,
`label`  varchar(255) DEFAULT NULL ,
`viewnum`  int(10) NULL DEFAULT NULL ,
`likenum`  int(10) NULL DEFAULT NULL ,
`reviewnum`  int(10) NULL DEFAULT NULL ,
`createtime`  bigint(20) NULL DEFAULT NULL ,
`creator`  varchar(40) DEFAULT NULL ,
`updatetime`  bigint(20) NULL DEFAULT NULL ,
`updater`  varchar(40) DEFAULT NULL ,
`creatorname`  varchar(255) DEFAULT NULL ,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC ;