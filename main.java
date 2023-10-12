import src.Rectangle;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong :");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai :");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("---------");
        System.out.println(rectangle.display());
        System.out.println("Dien tich : " + rectangle.getArea());
        System.out.println("Dien tich : " + rectangle.getPerimeter());

    }
}
