import java.util.Scanner;

public class Giaipt1 {
    public static void main(String[] args) {
                double x,a,b; // Khai báo biến x, a, b;
                Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
                System.out.print("Nhap vao he so a: ");
                a = sc.nextDouble(); // Nhập hệ số a từ bàn phím
                System.out.print("Nhap vao he so b: ");
                b = sc.nextDouble(); // Nhập hệ số b từ bàn phím
                if(a == 0){          // Kiểm tra test1 a = 0 , nếu a == 0 thì chạy code vào test2
                    if(b == 0){         // Nếu b == 0, thì phương trình vô số nghiệm
                        System.out.println("Phuong trinh vo so nghiem!");
                    }
                    else {           // Ngược lại nếu b khác 0 thì phương trình vô nghiệm
                        System.out.println("Phương trinh vo nghiem!");
                    }
                }
                else{ // Nếu a khác 0 , thì phương trình có nghiệm x
                    x = -b / a; // Tính nghiệm x theo ct x = -b / a;
                    System.out.println("Nghiem cua phuong trinh "+ a + "x + " + b + " = 0 la: " + "x = " + x);
                }
    }
}

