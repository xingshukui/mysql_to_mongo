package com.bajiuling;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author : xingshukui
 * @email : xingshukui@890media.com
 * @date : 2018/8/15 下午4:11
 * @desc :
 */
public class MysqlUtils {

    static {
        try {
         Class.forName(Constant.MYSQL_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /*public <T> T query(String sql, String[] param, ResultSetHandler<T> resultSetHandler) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }*/


    public static  <T> List<T> queryList(String sql, BeanListHandler<T> resultSetHandler) {
        QueryRunner queryRunner = new QueryRunner(getDataSource());
        List<T> list = null;
        try {
            list = queryRunner.query(sql, resultSetHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }



    private static DataSource getDataSource() {
        return new DataSource() {
            public Connection getConnection() throws SQLException {
                return DriverManager.getConnection(Constant.MYSQL_URL, Constant.MYSQL_NAME, Constant.MYSQL_PASSWORD);
            }

            public Connection getConnection(String username, String password) throws SQLException {
                return null;
            }

            public <T> T unwrap(Class<T> iface) throws SQLException {
                return null;
            }

            public boolean isWrapperFor(Class<?> iface) throws SQLException {
                return false;
            }

            public PrintWriter getLogWriter() throws SQLException {
                return null;
            }

            public void setLogWriter(PrintWriter out) throws SQLException {

            }

            public void setLoginTimeout(int seconds) throws SQLException {

            }

            public int getLoginTimeout() throws SQLException {
                return 0;
            }

            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        };
    }
}
