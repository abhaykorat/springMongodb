package com.example.springMongodb.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCreatedBy.class)
@Documented
public @interface ValidCreator {
    String message() default "Not a valid Creator....";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}