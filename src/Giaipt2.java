import java.util.Scanner;

public class Giaipt2 {
    public static void main(String[] args) {

        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao he so b: ");
        b = sc.nextInt();
        System.out.print("Nhap vao he so c: ");
        c = sc.nextInt();
        double D = -b * b - 4 * a * c;
        if(D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = "+ x1 + " x2 = "+x2);
        }
        else if(D == 0){
            double x = -b / (2 * a);
            System.out.printf("Phuong trinh co nghiem kep: x = "+ x);
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
