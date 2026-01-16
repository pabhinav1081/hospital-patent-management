package com.example.patenthospitalsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter

public class patientRequestDto {

    @NotBlank
    @Size(max=100,message = "name cannot exceed 100 character")
    private String name;

    @NotBlank

    @Email(message = "email should require")
    private String email;

    @NotBlank(message = "address cannot be empty")
    private String address;

    @NotBlank
    private String dateOfBirth;

    @NotNull(message = "register date is require")
    private String registeredDate;
}
