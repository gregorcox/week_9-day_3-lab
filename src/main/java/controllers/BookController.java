package controllers;

import db.DBHelper;
import models.Book;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class BookController {

    public BookController(){
        this.setupEndPoints();
    }

    private void setupEndPoints(){
        get("/books", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("template", "templates/books/index.vtl");

            List<Book> books = DBHelper.getAll(Book.class);
            model.put("books", books);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }
}
