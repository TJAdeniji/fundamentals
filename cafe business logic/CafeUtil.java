// package cafe business logic;
import java.util.*;

public class CafeUtil {
    
    public int getStreakGoal(int numWeeks){
        int streakGoal = 0;

        for (int i = 0; i <= numWeeks; i++){
            streakGoal = streakGoal + i;
        }
        return streakGoal;
        
    }

    public double getOrderTotal(double[] prices){
        double orderTotal = 0;
        
        for (int i = 0; i < prices.length; i++){
            orderTotal = orderTotal + prices[i];
        }

        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    } 
    
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        if (customers.size() == 1)
            System.out.println("There is " + customers.size() + " person in front of you.");
        else
            System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
    }



}
