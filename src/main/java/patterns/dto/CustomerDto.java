package patterns.dto;

public class CustomerDto {
    private final String name;
    private String email;

    public CustomerDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CustomerDto [name=" + name + ", email=" + email + "]";
    }
}
