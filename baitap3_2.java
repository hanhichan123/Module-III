import java.util.Scanner;

public class baitap3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = 0;
        double totalPoint = 0;
        double min = 11;
        double max = -1;

        do {
            System.out.println("***************MENU NHẬP ĐIỂM***************");
            System.out.println("1.Nhập điểm học viên");
            System.out.println("2.Hiển thị thống kê");
            System.out.println("3.Thoát");
            System.out.println("Mời bạn chọn từ 1 - 3");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                   while(true){
                       System.out.println("Nhậo vào điểm học viên (0 -> 10) và nhập -1 để không nhập nữa");
                       double point = Double.parseDouble(sc.nextLine());
                       if (point == -1) {
                           break;
                       }
                       if(point < 0 || point > 10) {
                           System.err.println("Điểm nhập vào không hợp lệ. Nhập lại");
                           continue;
                       }
                       if (point < 5) {
                           System.out.println("Học lực yếu");
                       } else if (point < 7) {
                           System.out.println("Học lực trung bình");
                       } else if (point < 8) {
                           System.out.println("Học lực khá");
                       } else if  (point < 9) {
                           System.out.println("Học lực gỏi");
                       } else {
                           System.out.println("Học lực xuất sắc");
                       }


                       // Tính toán
                       studentCount ++;
                       totalPoint += point;
                       if (max < point) {
                           max = point;
                       }
                       if (min > point) {
                           min = point;
                       }
                   }
                    break ;
                case 2 :
                    if (studentCount == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số học viên đã nhập :" + studentCount);
                        System.out.println("Điểm trung bình :" + totalPoint/studentCount);
                        System.out.println("Điểm cao nhất :" + max);
                        System.out.println("Điểm thấp nhất :" + min );
                    }
                    break ;
                case 3 :
                    System.exit(0);
                default:
                    System.out.println("Vùng lòng chọn 1 -> 3");
            }
        } while(true);
    }
}
