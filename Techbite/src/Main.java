import kitchen.Connectivity;
import kitchen.KitchenImplementation;
import management.ManagementImplementation;

import javax.xml.transform.Result;
import java.sql.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws SQLException {
       // Working JDBC to the SQL database
        ManagementImplementation mi = new ManagementImplementation();
        KitchenImplementation ki = new KitchenImplementation();

//        System.out.println(mi.getCustomers(1));
//        System.out.println(mi.getAmount(1));
//        System.out.println(mi.getOrder(1));
//        System.out.println(mi.getPopularDishes());
//        System.out.println(mi.getTotal("2024-04-11"));
//        System.out.println(mi.getCustomerDishes(1));

        System.out.println(ki.additionalRequirements(1));
        System.out.println(ki.getDishesAndQuantity(1));
        System.out.println();



    }
}
