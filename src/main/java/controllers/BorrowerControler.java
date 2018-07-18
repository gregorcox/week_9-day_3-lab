package controllers;

import db.DBHelper;
import models.Borrower;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class BorrowerControler {

    public BorrowerController() {
        this.setUpEndpoints();
    }

    public void setUpEndPoints() {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();


        //CREATE

        get("/borrower/new", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            List<Borrower> borrowers = DBHelper.getAll(Borrower.class);
            model.put("templates/borrowers", borrowers);
            model.put("template", "templates/engineers/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, velocityTemplateEngine);




    }


}
