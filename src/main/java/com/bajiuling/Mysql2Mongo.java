package com.bajiuling;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * @author : xingshukui
 * @email : xingshukui@890media.com
 * @date : 2018/8/15 下午3:58
 * @desc :
 */
public class Mysql2Mongo {


    public static void main(String[] args) {


        int page = 0;
        int pageSize = 50;

        long curr = System.currentTimeMillis();
        System.out.println("=================== current time " + curr + "=================");
        for (;;) {
            String sql = String.format("select * from tb_store_mp_user limit %d,%d", page, pageSize);
            List<StoreMpUserEntity> list = MysqlUtils.queryList(sql, new BeanListHandler<>(StoreMpUserEntity.class));
            if (list.size() <= 0) {
                break;
            }

            for (StoreMpUserEntity entity :list) {
                MongoUtils.insert(entity);

            }
            page += pageSize;
        }
        long end = System.currentTimeMillis();
        System.out.println("=================== current time " + end + "=================");
        System.out.println("=================== total time " + (end - curr) + "=================");

    }





}
