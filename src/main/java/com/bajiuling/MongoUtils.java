package com.bajiuling;

import com.alibaba.fastjson.JSON;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @author : xingshukui
 * @email : xingshukui@890media.com
 * @date : 2018/8/15 下午4:30
 * @desc :
 */
public class MongoUtils {

    private static MongoClient mongoClient = new MongoClient(new MongoClientURI(Constant.MONGO_URL));



    public static void query () {
        MongoDatabase db = mongoClient.getDatabase("jihepai_dev");
        MongoCollection<Document> collection = db.getCollection("store_mp_user");

        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            System.out.println(document);
        }
    }

    public static void insert(StoreMpUserEntity entity) {
        MongoDatabase db = mongoClient.getDatabase("jihepai_dev");
        MongoCollection<Document> collection = db.getCollection("store_mp_user");

        String strJson = JSON.toJSONStringWithDateFormat(entity, "yyyy-MM-dd HH:mm:ss");
        System.out.println(strJson);
        Document document = Document.parse(strJson);
        document.append("_id", entity.getId());
        document.remove("id");
        document.remove("create_time");
        document.remove("update_time");
        document.append("create_time",entity.getCreate_time());
        document.append("update_time",entity.getUpdate_time());
        //时间格式问题
        collection.insertOne(document);
    }
}
