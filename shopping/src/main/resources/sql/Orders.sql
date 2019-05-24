-- auto Generated on 2019-05-23
-- DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  order_id    INT(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  user_id     INT(11)     NOT NULL DEFAULT -1
  COMMENT 'userId',
  `number`    VARCHAR(50) NOT NULL DEFAULT ''
  COMMENT 'number',
  create_time DATE        NOT NULL DEFAULT '1000-01-01'
  COMMENT 'createTime',
  INDEX (user_id),
  PRIMARY KEY (order_id),
  constraint `order_user` foreign key (user_id) references user (user_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT 'orders';
