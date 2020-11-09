import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.print("Enter the width: ");
        double width=checkNumber(" value of width is number");
        System.out.print("Enter the height: ");
        double height=checkNumber(" Value of height is number");

        InfoRectangle rectangle;
        rectangle= new InfoRectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        System.out.println(rectangle);
    }
    public static double checkNumber(String mess){
        boolean check=true;
        double number=0;
        Scanner input= new Scanner(System.in);
        do {
            try{
                number=Double.parseDouble(input.nextLine());
                check=false;
            }catch (Exception e){
                System.out.println(" Please try again"+mess);
            }
        }while (check);
        return number;
    }
}
