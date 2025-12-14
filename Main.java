//import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Bài 2.1
//        Nhập một số nguyên từ bàn phím.
//        Sử dụng câu lệnh if-else để xác định số đó là chẵn hay lẻ.
//        Trường hợp số là 0, hiển thị thông báo: "Số không phải chẵn cũng không phải lẻ".

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên : ");
//        int n = sc.nextInt();
//
//        if(n == 0) {
//            System.out.printf("Số %d không phải số chẵn cũng k phải số lẻ %n", n);
//        } else if (n % 2 == 0 ) {
//            System.out.printf("Số %d là số chẵn %n", n);
//        }  else {
//            System.out.printf("Số %d là số lẻ %n", n);
//        }

        // Bài 2.2

//        Sinh viên cần viết một chương trình Java thực hiện các nhiệm vụ sau:
//        Yêu cầu người dùng nhập một số nguyên từ 1 đến 7.

//        Scanner sc = new Scanner(System.in);
//        // Yêu cầu người dùng nhập một số nguyên từ 1 đến 7.
//
//        System.out.println("Nhập vào một số nguyên từ 1 - 7");
//        int n = sc.nextInt();
//
//        switch (n) {
//            case 1 :
//                System.out.println("Chủ nhật");
//                break;
//            case 2 :
//                System.out.println("Thứ 2");
//                break;
//            case 3 :
//                System.out.println("Thứ 3");
//                break;
//            case 4 :
//                System.out.println("Thứ 4");
//                break;
//            case 5 :
//                System.out.println("Thứ 5");
//                break;
//            case 6 :
//                System.out.println("Thứ 6");
//                break;
//            case 7 :
//                System.out.println("Thứ 7");
//                break;
//                default :
//                System.out.println("Số nhập vào không hợp lệ.");
//        }

        // Bài 3

//        Đầu vào:
//        Một số nguyên dương N được nhập từ bàn phím.
//        Nếu người dùng nhập số không hợp lệ (ví dụ: số âm hoặc số 0), hiển thị thông báo lỗi “Số nhập vào không hợp lệ”.
//        Xử lý:
//        Sử dụng vòng lặp for để tính tổng các số từ 1 đến N.
//        Tính tổng bằng cách cộng dồn từng giá trị từ 1 đến N.
//        Đầu ra:
//        Hiển thị kết quả tính tổng trên.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số n");
//        int n = sc.nextInt();
//
//       if (n <= 0) {
//           System.out.println("Số Nhập vào không hợp lệ");
//       } else {
//           int sum = 0;
//           for (int i = 1; i <= n; i++) {
//               sum = sum + i;
//
//           }
//           System.out.printf("Tổng từ 1 đến %d là %d%n", n, sum);
//       }

                                    // Bài 4

//        Sử dụng vòng lặp while hoặc do…While để lấy giá trị tuổi từ người dùng , điều kiện lặp là người dùng nhập vào không phải là một số nguyên .
//        Nếu người dùng nhập sai thì in ra thông báo : “ Vui lòng nhập vào một số nguyên  và lớn hơn 0 ” .
//        Sau khi người dùng nhập đúng tuổi là một số nguyên thì in ra dòng chữ : “ Tuổi của bạn là [age] ! “ .\

//        Scanner sc  = new Scanner(System.in);
//        sc.useLocale(Locale.US);
//        int age;
//        while (true) {
//            System.out.println("Nhập vào tuổi của bạn");
//            age  = sc.nextInt();
//
//            if (age <= 0) {
//                System.out.println("Vui lòng nhập vào một số nguyên và lơn hơn 0 ");
//            } else {
//                System.out.printf("Tuổi của bạn là :" + age);
//                break;
//            }
//
//        }

                                        // Bài 5

//        Sinh viên cần viết một chương trình Java thực hiện các nhiệm vụ sau:
//        Yêu cầu người dùng nhập một số nguyên từ 1 đến 12 (tương ứng với tháng)
//        Sử dụng cấu trúc switch-case để:
//        Hiển thị tên tháng
//        Hiển thị số ngày của tháng:
//        Tháng 1, 3, 5, 7, 8, 10, 12: có 31 ngày
//        Tháng 4, 6, 9, 11: có 30 ngày
//        Tháng 2: có 28 hoặc 29 ngày
//        Xử lý trường hợp người dùng nhập số không hợp lệ (không nằm trong khoảng 1-12) và hiển thị thông báo: "Tháng không hợp lệ.”

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập vào 1 tháng trong năm 1 -> 12");
//        int month = sc.nextInt();
//
//        switch (month) {
//            case 1 :
//                System.out.println("Tháng 1 có 31 ngày");
//                break;
//            case 2 :
//                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
//                break;
//            case 3 :
//                System.out.println("Tháng 3 có 31 ngày");
//                break;
//            case 4 :
//                System.out.println("Tháng 4 có 30 ngày");
//                break;
//            case 5 :
//                System.out.println("Tháng 5 có 31 ngày");
//                break;
//            case 6 :
//                System.out.println("Tháng 6 có 30 ngày");
//                break;
//            case 7 :
//                System.out.println("Tháng 7 có 31 ngày");
//                break;
//            case 8 :
//                System.out.println("Tháng 8 có 30 ngày");
//                break;
//            case 9 :
//                System.out.println("Tháng 9 có 31 ngày");
//                break;
//            case 10 :
//                System.out.println("Tháng 10 có 30 ngày");
//                break;
//            case 11 :
//                System.out.println("Tháng 11 có 31 ngày");
//                break;
//            case 12 :
//                System.out.println("Tháng 12 có 30 ngày");
//                break;
//            default :
//                System.out.println("Tháng không hợp lệ.");
//        }

                                                // Bài tập 6
//        Hiểu cách sử dụng vòng lặp để xử lý từng chữ số của một số nguyên.
//        Luyện tập kỹ năng sử dụng toán tử số học (%, /) để thao tác với số.
//        Áp dụng cấu trúc vòng lặp để tính toán và cập nhật giá trị.
//        Viết chương trình Java để tính tổng các chữ số của một số nguyên bất kỳ được nhập từ bàn phím.
//        Ví dụ: với số 12345, tổng các chữ số là: 1+2+3+4+5=15.


//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Nhập vào một số nguyên bất kỳ");
//        int num = sc.nextInt();
//        num = Math.abs(num);
//        int tong = 0;
//        while(num != 0 ) {
//            int tmp  = num % 10;
//            num = num / 10;
//            tong += tmp;
//        }
//        System.out.println(tong);

                                        // Bài 7
        

    }
    }
