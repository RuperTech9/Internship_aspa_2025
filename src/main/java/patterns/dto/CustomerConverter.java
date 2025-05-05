package patterns.dto;

public class CustomerConverter {
    public static CustomerDto convert(Customer customer) {
        return new CustomerDto(customer.getName(), customer.getEmail());
    }
}
