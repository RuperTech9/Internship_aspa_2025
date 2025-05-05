package patterns.dto.main;

import patterns.dto.Customer;
import patterns.dto.CustomerConverter;
import patterns.dto.CustomerDto;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alex", "alex@gmail.com", "123456");
        CustomerDto dto = CustomerConverter.convert(customer);

        System.out.println(dto);

    }
}
