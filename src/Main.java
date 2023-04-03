import java.util.Date;
import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    static double x = 1.426;
    static double y = -1.220;
    static double z = 3.5;
    public static void main(String[] args) {
        new solution().show_results(x,y,z);
        new solution().time();
        new solution().p(x,y,z);
        System.out.println("Введіть своє значення");
        Scanner s = new Scanner(System.in);
        System.out.print("\n x = ");
        double my_x = s.nextInt();
        System.out.print("\n y = ");
        double my_y = s.nextDouble();
        System.out.print("\n z = ");
        double my_z = s.nextInt();

        new solution().show_results(my_x,my_y,my_z);
    }
}
class solution {
    double a(double x, double y, double z) {
        return (2 * cos(x - PI / 6)) / ((1 / 2) + pow(sin(y), 2));
    }

    double b(double x, double y, double z) {
        return 1+((pow(z,2)/3+(pow(z,2)/5)));
    }
    void show_results(double x, double y, double z){
        System.out.println("a = "+a(x, y, z)+"\n b= "+b(x, y, z));
    }
    void time() {
        Date d = new Date();
        System.out.printf("Сьогодні %1$ta %1$tb %1$td %1$tT %1$tZ %1$tY \n ", d );
    }
    void p(double x, double y, double z){
        System.out.println("x = "+ x + ",y ="+ y + ",z = "+ z );
    }
}