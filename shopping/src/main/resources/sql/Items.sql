-- auto Generated on 2019-05-23
-- DROP TABLE IF EXISTS items;
CREATE TABLE items (
  item_id     INT(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  item_name   VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'itemName',
  detail      VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'detail',
  picture     VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'picture',
  create_time DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00'
  COMMENT 'createTime',
  INDEX (item_name),
  PRIMARY KEY (item_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT 'items';
