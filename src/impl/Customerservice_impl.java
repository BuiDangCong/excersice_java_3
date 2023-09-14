package impl;

import Models.Customer;
import Service.BaseService;
import java.util.ArrayList;
import java.util.List;

public class Customerservice_impl implements BaseService<Customer> {

    List<Customer> Customerlist = new ArrayList<>();
    private Customer customer;

    @Override
    public List<Customer> getAll() {
        return this.Customerlist;
    }

    @Override
    public boolean save(Customer t) {
        Customerlist.add(customer);
        return true;

    }

    @Override
    public boolean upDate(Customer t) {
        if (!this.Customerlist.isEmpty()) {
            for (int i = 0; i < this.Customerlist.size(); i++) {
                if (customer.getiD() == Customerlist.get(i).getiD()) {
                    Customerlist.get(i).setName(customer.getName());
                    Customerlist.get(i).setAddress(customer.getAddress());
                    Customerlist.get(i).setAge(customer.getAge());
                }
            }
        }
        return true;

    }

    @Override
    public boolean delete(int id) {
        if (this.Customerlist.isEmpty()) {
            for (int i = 0; i < this.Customerlist.size(); i++) {
                if (Customerlist.get(i).getiD() == id) {
                    Customerlist.remove(id);
                }
            }
        }

        return false;

    }

}
