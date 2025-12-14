import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bài tập 1 :
        // System.out.println("Hello, Java");

        // Bài tập 2 :
        // System.out.printf("Tên tôi là %s, tôi %s tuổi, hiện tại đang học tại %s, Quên quán ở %s", "Nguyễn văn A", "22", "PTIT", "Cà Mau");

        // Bài tập 3 :
        // cho người dùng nhập vào bán kính
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Nhậo vào bán kính của hình tròn : ");
//
//        double rTron = sc.nextDouble();
//
//        // công thức tính hình tròn
//
//        double sTron = 3.14 * (rTron * rTron);
//
//        // in ra kết quả
//        System.out.printf("Diện tích hình tròn là", + sTron);

        // Bài tập 4 :
//        Scanner sc = new  Scanner(System.in);
//        // khai báo 2 biến a và b
//        System.out.println("Nhập vào số a :");
//        int a =  sc.nextInt();
//        System.out.println("Nhập vào số b :");
//        int b =  sc.nextInt();
//        // tính tổng của a và b
//        int sum = a + b;
//        int diffence = a - b;
//        int product = a * b;
//        int quotient = a / b;
//        int remainder = a % b;
//
//        System.out.printf("Tổng: %d , Hiệu : %d, Tích : %d , Thương : %d, Chia có dư : %d%n ", +sum,diffence,product,quotient,remainder);

        // Bài tập 5 : Tính tổng của 2 phân số
//        Scanner sc = new Scanner(System.in);
//
//        // khai báo tử số a và và mẫu số b
//        System.out.println("Nhập vào tử số a : ");
//        int a = sc.nextInt();
//        System.out.println("Nhập vào mẫu số b : ");
//        int b = sc.nextInt();
//
//
//        // khai báo tử số c và mẫu số d
//        System.out.println("Nhập vào tử số c : ");
//        int c = sc.nextInt();
//        System.out.println("Nhập vào mẫu số d : ");
//        int d = sc.nextInt();
//
//
//        // Tính tổng của 2 phân số
//
//        int tongtuso = (a * d) + (b * c);
//        int tongmauso = (b * d);
//
//        System.out.printf("Phân số 1 : %d / %d, phân số 2 : %d / %d - Kết quả là %d / %d %n", a, b, c, d, tongtuso, tongmauso);

        // Bài tập 6
        // Tính diện tích và chu vi của hình chữ nhật

       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Nhậo vào chiều rộng của hình chữ nhật: ");
        float width =  sc.nextFloat();
        System.out.println("Nhật vào chiều cao của hình chữ nhật");
        float height = sc.nextFloat();

        // Công thức tính diện tích

        float area  = width * height;

        // Công thức tính chu vi

        float circumference = 2 * (width + height);

        System.out.printf("Với widht : %.2f , height : %.2f . Diện tích của hình chữ là : %.2f và chu vi là : %.2f%n", width, height, area, circumference);

    }
}



