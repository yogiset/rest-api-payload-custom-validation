package org.acme.dto;



import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import org.acme.constraint.NotExpired;

import java.time.LocalDate;

public record DeveloperData(
         @NotBlank
         String name,
         @NotExpired
         @JsonFormat(pattern = "dd-MM-yyyy")
         LocalDate certificate
) {

}
