package class_obj;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class HouseAreaRedo {
    
    public static void main(String args[]) {

        HouseAreaRedo houseAreaRedo = new HouseAreaRedo();

        Rectangle kitchen = houseAreaRedo.getRoom();
        Rectangle bathRoom = houseAreaRedo.getRoom();
        double area = houseAreaRedo.calculateTotalArea(kitchen, bathRoom);

        System.out.println("area = " + area);
    }

    public Rectangle getRoom() {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enetr the lenght of the room:");
         double length = scanner.nextDouble();

         System.out.println("Enter the width of the room:");
         double width = scanner.nextDouble();
         
         return new Rectangle(length, width);
     }

     public double calculateTotalArea(Rectangle kitchen, Rectangle bathroom) {
        return kitchen.calculateArea() + bathroom.calculateArea();
     }
}
