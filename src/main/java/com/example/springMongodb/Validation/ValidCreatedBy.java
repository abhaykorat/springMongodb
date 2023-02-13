package com.example.springMongodb.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCreatedBy implements ConstraintValidator<ValidCreator, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.matches("[a-z]+}")) {
            return true;
        } else {
            return false;
        }
    }
}