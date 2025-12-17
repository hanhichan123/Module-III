import java.util.Scanner;

public class baitap3_3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int staffCount = 0;
        long salaryCount = 0;
        long maxSalary = -1 ;
        long minSalary = 500000001;

        do {
            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1.Nhập lương nhân viên");
            System.out.println("2.Hiển thị thống kê");
            System.out.println("3.Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.Thoát");
            System.out.println("Chọn từ 1 -> 4");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    while (true) {
                        System.out.println("Nhập vào số tiền lương(Từ 0 - 500M), Nhập -1 để kết thúc nhập");
                        long salary =  Long.parseLong(sc.nextLine());
                        if (salary == -1) {
                            break;
                        }
                        if (salary < 0 || salary > 500000000) {
                            System.out.println("Số tiền lương nhập vào không hợp lệ");
                            continue;
                        }
                        if (salary < 5000000) {
                            System.out.println("Thu nhập thấp");
                        } else if (salary < 15000000){
                            System.out.println("Thu nhập trung bình");
                        } else if (salary < 50000000) {
                            System.out.println("Thu nhập khá");
                        } else {
                            System.out.println("Thu nhập cao");
                        }

                        // Tính tóan
                        // Tổng nhân viên
                        staffCount ++;
                        salaryCount += salary;
                        if (maxSalary < salary) {
                            maxSalary = salary;
                        }
                        if  (minSalary > salary) {
                            minSalary = salary;
                        }
                    }
                    break;
                case 2 :
                    if (staffCount == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số nhân viên đã nhập :" + staffCount);
                        System.out.println("  Lương trung bình :" + salaryCount/staffCount);
                        System.out.println("  Lương cao nhất :" + maxSalary);
                        System.out.println("  Lương thấp nhất :" + minSalary);
                        System.out.println("  Tổng lương :" + salaryCount);
                    }
                    break;
                case 3 :
                    System.out.println("Nhập vào số lương của nhân viên");
                    long salary = Long.parseLong(sc.nextLine());
                    if (0 < salary && salary < 5000000 ) {
                        System.out.println("Tổng tiền thưởng cuả nhân viên là :" + salary * 0.05);
                    } else if (salary < 15000000) {
                        System.out.println("Tổng tiền thưởng cuả nhân viên là :" + salary * 0.10);
                    } else if (salary < 50000000) {
                        System.out.println("Tổng tiền thưởng cuả nhân viên là :" + salary * 0.15);
                    } else if (salary < 100000000) {
                        System.out.println("Tổng tiền thưởng cuả nhân viên là :" + salary * 0.20);
                    }else {
                        System.out.println("Tổng tiền thưởng cuả nhân viên là :" + salary * 0.25);
                    }
                    break;
                case 4 :
                    System.exit(0);
                    default:
                        System.out.println("Số nhập vào không đúng");
            }

        } while (true) ;
    }
}
