
create database order_db;

create database order_item_db;

DROP TABLE IF EXISTS t_order_2;
CREATE TABLE t_order_2 (
order_id bigint(20) NOT NULL COMMENT '订单id',
price decimal(10, 2) NOT NULL COMMENT '订单价格',
user_id bigint(20) NOT NULL COMMENT '下单用户id',
status varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
PRIMARY KEY (order_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS t_order_1;
CREATE TABLE t_order_1 (
order_id bigint(20) NOT NULL COMMENT '订单id',
price decimal(10, 2) NOT NULL COMMENT '订单价格',
user_id bigint(20) NOT NULL COMMENT '下单用户id',
status varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
PRIMARY KEY (order_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;


The t_order_item table structure :

DROP TABLE IF EXISTS t_order_item_1;
CREATE TABLE t_order_item_1 (
order_id bigint(20) NOT NULL COMMENT '订单id',
order_info varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单详情',
PRIMARY KEY (order_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS t_order_item_2;
CREATE TABLE t_order_item_1 (
order_id bigint(20) NOT NULL COMMENT '订单id',
order_info varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单详情',
PRIMARY KEY (order_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;