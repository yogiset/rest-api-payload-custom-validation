package org.acme.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.util.Objects;

public class NotExpiredValidator implements ConstraintValidator<NotExpired, LocalDate> {

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        if(Objects.isNull(localDate)) return  false;

        return LocalDate.now().isBefore(localDate);
    }
}
