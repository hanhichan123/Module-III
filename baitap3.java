import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
/*
 Viết chương trình Java Console cho phép người dùng nhập:
·        Tên khách hàng
·        Tên sản phẩm
·        Giá sản phẩm
·        Số lượng mua
·        Khách có thẻ thành viên hay không (true/false)
 */
        Scanner sc = new Scanner(System.in);
        // Nhập thên khách hàng
        System.out.println("Nhập vào tên khách hàng");
        String customerName =  sc.nextLine();
        // Nhập tên sản phẩm
        System.out.println("Nhập vào tên sản phẩm");
        String produceName =  sc.nextLine();
        // Nhập vào giá sản phẩm
        System.out.println("Nhậo vào giá sản phẩm");
        double price = Double.parseDouble(sc.nextLine());
        // Nhập vào số lượng mua
        System.out.println("Nhập vào số lượng mua");
        int quantity = Integer.parseInt(sc.nextLine());
        // Kiểm tra khách hàng có phải là thành viên hay không
        System.out.println("Khách hàng có phải là thành viên hay không (True or False)");
        boolean member =  Boolean.parseBoolean(sc.nextLine());
//        Chương trình thực hiện tính
//·        Thành tiền = giá * số lượng mua
//·        Nếu là thành viên giảm 10% giá - (giá * 10 / 100)
//        price * 0.9
//·        Tính tiền VAT 8%
//        price + (price * 0.8)
//·        Tổng tiền thanh toán = Thành tiền – Giám giá + VAT
            double vatPrice = 0;
            double amount = 0;
            double discount = 0;
            double totalAmount = 0;


            amount = price * quantity;
            if (member) {
                discount = price * 0.1;
            }
            vatPrice = amount * 0.08;
            totalAmount = amount - discount - vatPrice;

        System.out.println("Khách Hàng :" + customerName);
        System.out.println("Sản phẩm :" + produceName);
        System.out.println("Giá :" + price);
        System.out.println("Số lượng :" + quantity);
        System.out.println("Thành tiền :" + amount);
        System.out.println("Giảm giá :" + discount);
        System.out.println("Tiền VAT :" + vatPrice);
        System.out.println("Tổng tiền thanh toán :" + totalAmount);

    }
}
