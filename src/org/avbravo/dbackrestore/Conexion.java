/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.dbackrestore;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author avbravo
 */
public class Conexion {

    private static String prefijo;
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static ResultSetMetaData mdata;
    static DatabaseMetaData dmd;

    /*
     * Informacion de la conexion a la base de datos
     */
    static String userDB;
    static String passwordDB;
    static String urlDB;
    static String driverDB;

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        Conexion.conn = conn;
    }

    public static DatabaseMetaData getDmd() {
        return dmd;
    }

    public static void setDmd(DatabaseMetaData dmd) {
        Conexion.dmd = dmd;
    }

    public static String getDriverDB() {
        return driverDB;
    }

    public static void setDriverDB(String driverDB) {
        Conexion.driverDB = driverDB;
    }

    public static ResultSetMetaData getMdata() {
        return mdata;
    }

    public static void setMdata(ResultSetMetaData mdata) {
        Conexion.mdata = mdata;
    }

    public static String getPasswordDB() {
        return passwordDB;
    }

    public static void setPasswordDB(String passwordDB) {
        Conexion.passwordDB = passwordDB;
    }

    public static String getPrefijo() {
        return prefijo;
    }

    public static void setPrefijo(String prefijo) {
        Conexion.prefijo = prefijo;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        Conexion.rs = rs;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        Conexion.stmt = stmt;
    }

    public static String getUrlDB() {
        return urlDB;
    }

    public static void setUrlDB(String urlDB) {
        Conexion.urlDB = urlDB;
    }

    public static String getUserDB() {
        return userDB;
    }

    public static void setUserDB(String userDB) {
        Conexion.userDB = userDB;
    }
}
