-- auto Generated on 2019-05-24
-- DROP TABLE IF EXISTS order_detail;
CREATE TABLE order_detail (
  detail_id INT(11) NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  order_id  INT(11) NOT NULL DEFAULT -1
  COMMENT 'orderId',
  item_id   INT(11) NOT NULL DEFAULT -1
  COMMENT 'itemId',
  item_num  INT(11) NOT NULL DEFAULT -1
  COMMENT 'itemNum',
  INDEX (order_id),
  INDEX (item_id),
  PRIMARY KEY (detail_id),
  constraint `detail_order` foreign key (order_id) references orders (order_id),
  constraint `detail_item` foreign key (item_id) references items (item_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT 'order_detail';
