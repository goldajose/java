package class_obj;

public class House {

    public static void main(String args[]) {

        Rectangle roomOne = new Rectangle();
        roomOne.setLength(20);
        roomOne.setBreadth(12);
        double areaOne = roomOne.calculateArea();
        double perimeterOne = roomOne.calculatePerimeter();

        Rectangle roomTwo = new Rectangle(20,11);
        double areaTwo = roomTwo.calculateArea();
        double perimeterTwo = roomTwo.calculatePerimeter();
        
        double totalArea = areaOne + areaTwo;
        System.out.println("totalArea = " + totalArea);
    }
}
