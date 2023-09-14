
import Models.Customer;
import impl.Customerservice_impl;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Customerservice_impl customerservice = new Customerservice_impl();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Danh sách khách hàng");
            System.out.println("2.Đăng kí thành viên mới ");
            System.out.println("3.Cập nhật ");
            System.out.println("4.Xoá ");
            System.out.println("5.Nhập vào chức năng mong muốn ");

            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    List<Customer> customerlist = customerservice.getAll();
                    if (!customerlist.isEmpty()) {
                        for (Customer customer : customerlist) {
                            System.out.println(customer.toString()
                            );
                        }
                    } else {
                        System.out.println("Danh sách trống");
                    }

                    break;
                case 2:
                    customerservice.save(new Customer().input_data());
                    break;
                case 3:
                    customerservice.upDate(new Customer().input_data());

                    break;
                case 4:
                    System.out.println("Nhập vào id cần xoá");
                    Integer.parseInt(sc.nextLine());
                    break;
                default:
                    System.out.println("Lựa chọn không đúng");
                    break;
            }
        }
    }

}
