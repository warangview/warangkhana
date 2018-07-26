package controllers;

import models.Add;
import models.Yamaha;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import scala.math.Ordering;
import scala.reflect.internal.Trees;
import views.html.*;

public class Application extends Controller {



    public static Result D() {
        return ok (D.render());
    }
    public static Result host1() {
        return ok (host1.render());
    }
    public static Result location() {
        return ok(location.render());
    }
    public static Result products() {
        return ok(products.render());
    }
    public static Result promotions() {
        return ok (promotions.render());
    }
    public static Result index() {
        return ok (index.render());
    }


    public static Result Yamaha (){

        Yamaha ya1 = new Yamaha("R001","R12014","ma1",890000);
        Yamaha ya2 = new Yamaha("R002","R12015","ma2",790000);
        Yamaha ya3 = new Yamaha("R003","R12015","ma3",890000);
        Yamaha ya4 = new Yamaha("R004","R12015","m4",890000);
        Yamaha ya5 = new Yamaha("R005","R12015","m5",890000);
        Yamaha ya6 = new Yamaha("R006","R1015","m6",890000);

        Yamaha rya1 = new Yamaha("R007","R12014","ma1",890000);
        Yamaha rya2 = new Yamaha("R008","R12015","ma2",790000);
        Yamaha rya3 = new Yamaha("R009","R12015","ma3",890000);
        Yamaha rya4 = new Yamaha("R0010","R12015","m4",890000);
        Yamaha rya5 = new Yamaha("R0011","R12015","m5",890000);
        Yamaha rya6 = new Yamaha("R0012","R1015","m6",890000);

        Yamaha bya1 = new Yamaha("R0013","R12014","ma1",890000);
        Yamaha bya2 = new Yamaha("R0014","R12015","ma2",790000);
        Yamaha bya3 = new Yamaha("R0015","R12015","ma3",890000);
        Yamaha bya4 = new Yamaha("R0016","R12015","m4",890000);
        Yamaha bya5 = new Yamaha("R0017","R12015","m5",890000);
        Yamaha bya6 = new Yamaha("R0018","R1015","m6",890000);
        return ok(yamaha.render(ya1, ya2, ya3, ya4, ya5, ya6,rya1,rya2,rya3,rya4,rya5,rya6,bya1,bya2,bya3,bya4,bya5,bya6));

    }

    public static  Result form(){
        return ok(form.render());
    }

    public static  Result showform(){
        DynamicForm formAdd = Form.form().bindFromRequest();
        String id,name,brand;
        double price;
        int amount;
        id = formAdd.get("id");
        name = formAdd.get("name");
        brand = formAdd.get("brand");
        price = Double.parseDouble(formAdd.get("price"));
        amount = Integer.parseInt(formAdd.get("amount"));

        Add output = new Add(id,name,brand,price,amount);

        return ok(showform.render(output));
    }


}


