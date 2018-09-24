import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        scanner.nextLine();
        if (x>0 && y>0){
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w I ćwiartce." );
        }
        if (x<0 && y>0){
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w II ćwiartce." );
        }
        if ( x<0 && y<0){
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w III ćwiartce." );
        }
        if (x>0 && y<0){
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w IV ćwiartce." );
        }
    }
}
