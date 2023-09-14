package Models;

import java.util.Scanner;

public class Customer extends Common {

    private String address;
    private int age;

    public Customer(String address, int age, int iD, String name) {
        super(iD, name);
        this.address = address;
        this.age = age;
    }

    private Customer() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display_infor() {
        System.out.println("Mã :" + this.getiD());
        System.out.println("Tên :" + this.getName());
        System.out.println("Địa chỉ :" + this.getAddress());
        System.out.println("Tuổi :" + this.getAge());
    }

    public void input_data() {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Mã :");
        customer.setiD(Integer.parseInt(sc.nextLine()));
        System.out.println("Tên :" + this.getName());
        customer.setName(sc.nextLine());
        System.out.println("Địa chỉ :" + this.getAddress());
         customer.setAddress(sc.nextLine());
        System.out.println("Tuổi :" + this.getAge());
        customer.setiD(Integer.parseInt(sc.nextLine()));
    }

}
