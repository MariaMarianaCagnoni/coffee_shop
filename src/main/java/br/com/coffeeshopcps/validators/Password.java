package br.com.coffeeshopcps.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordRuleValidator.class)
public @interface Password {

    String message() default "Password do not adhere to the specified rule";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
