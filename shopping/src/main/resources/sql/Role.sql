-- auto Generated on 2019-05-26
-- DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  role_id BIGINT(15)  NOT NULL AUTO_INCREMENT
  COMMENT 'roleId',
  `name`  VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'name',
  PRIMARY KEY (role_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT 'role';
