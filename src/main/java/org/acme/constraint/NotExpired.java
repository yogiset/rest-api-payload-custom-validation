package org.acme.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotExpiredValidator.class)
public @interface NotExpired {
    String message() default "Tidak boleh expired !";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
