package net.serenitybbd.screenplay.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Client {
    private String name;
    private String lastName;
    private String id;
    private String dateBirth;
    private String phone;
    private String maritalStatus;
    private String email;
    private String gender;
    private String address;
}

