package net.javaci.bank.db.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.javaci.bank.db.model.enumaration.EmployeeRoleType;
import net.javaci.bank.db.model.enumaration.EmployeeStatusType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.beans.Transient;
import java.time.LocalDate;



@Getter @Setter @ToString
public class Employee {
    private Long id;

    private String citizenNumber;

    @NotEmpty
    @Size(min=2,max=32)
    private String firstName;

    @NotEmpty
    @Size(min=2,max=32)
    private String middleName;

    @NotEmpty
    @Size(min=2,max=32)
    private String lastName;

    @NotEmpty
    @Size(min=2,max=32)
    private String email;

    private String phoneNumber;

    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private EmployeeStatusType status;

    private EmployeeRoleType role = EmployeeRoleType.USER;

}
