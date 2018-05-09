package com.atrachel.model;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hd48552 on 2018/5/8.
 */
public class ZoneDAO {
//    增
//    删
    public void delete(Integer id){
        String sql = "delete  from `zone` where id = ?";
        Connection con = creatConnect();
        PreparedStatement  preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setObject(1,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            releaseConnect(con,preparedStatement,resultSet);
        }

    }
//    改
//    查
    public List<Zone> getAllZone(){
        List<Zone> zones = new ArrayList<>();
        //todo;
        String sql = "select * from `zone` where id between ? and ?";
        Connection con = creatConnect();
        PreparedStatement  preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setObject(1,1);
            preparedStatement.setObject(2,6);
            resultSet = preparedStatement.executeQuery();
//            Zone zone = null;
            while (resultSet.next()){
                Zone zone = new Zone(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));

                zones.add(zone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            releaseConnect(con,preparedStatement,resultSet);
        }

        return zones;
    }

    public Connection creatConnect(){
        Connection conn =null;
        //todo
//        String userName = "TCFlyIntIe" ;
//        String passWord ="ZnD7aJCFm9FvktrsY6RZ";
//        String jdbcURL = "jdbc:mysql://10.100.157.78,3500/TCFlyIntIe";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser("TCFlyIntIe");
        comboPooledDataSource.setPassword("ZnD7aJCFm9FvktrsY6RZ");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://10.100.157.78:3500/TCFlyIntIe");
        comboPooledDataSource.setInitialPoolSize(5);
        comboPooledDataSource.setMinPoolSize(5);
        comboPooledDataSource.setMaxPoolSize(10);

        try {
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
            conn = comboPooledDataSource.getConnection();
//            System.out.println(conn);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  conn;
    }

    public  void  releaseConnect(Connection conn, Statement sta, ResultSet res){
        if(res!=null)
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        if(sta!=null){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
    }
}
