package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.sql.*;

public class Application extends Controller {

    public static Result index() {
//        return ok(index.render("Yasunaga みてるー！？."));
        return redirect()

    }


    public static Result toSecond() {
        return Results.TODO;
    }
}
