package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.sql.*;

public class Application extends Controller {

    public static Result index() {

//        //test2
//        Connection conn = null;
//        String url = "jdbc:mysql://localhost:3306/HackAso";
//        String user = "Akihiro";
//        String password = "Akihiro";
//        String message = null;
//
//        try{
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.print("SQL接続出来ているみたい");
//            Statement stmt = conn.createStatement();
//            String sql = "SELECT * FROM sample";
//            ResultSet rs = stmt.executeQuery(sql);
//            message = rs.getString(1);
//
//            // データベースに対する処理
//
//        }catch (SQLException e) {
//            message = "失敗";
//        }
        return ok(index.render("Yasunaga みてるー！？."+message));
    }

}
