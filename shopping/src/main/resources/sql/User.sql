-- auto Generated on 2019-05-23
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  user_id  INT(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'userId',
  username VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'username',
  sex      VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'sex',
  birthday DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00'
  COMMENT 'birthday',
  INDEX (username),
  PRIMARY KEY (user_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT 'user';
