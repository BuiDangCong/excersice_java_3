
import impl.Bookservice_impl;
import java.util.Scanner;

public class Main2 {

    private Bookservice_impl bookservice = new Bookservice_impl();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Danh sách đầu sách");
            System.out.println("2.Đăng kí đầu sách mới ");
            System.out.println("3.Cập nhật ");
            System.out.println("4.Xoá ");
            System.out.println("5.Nhập vào chức năng mong muốn ");

            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    List<Book> booklist = bookrvice.getAll();
                    if (!booklist.isEmpty()) {
                        for (Book book : booklist) {
                            System.out.println(booklist.toString()
                            );
                        }
                    } else {
                        System.out.println("Danh sách trống");
                    }

                    break;
                case 2:
                    bookservice.save(new Book().input_data());
                    break;
                case 3:
                    bookservice.upDate(new Book().input_data());

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
