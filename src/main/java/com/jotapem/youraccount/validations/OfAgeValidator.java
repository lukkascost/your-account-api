package com.jotapem.youraccount.validations;

import com.jotapem.youraccount.validations.constraints.OfAgeConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OfAgeValidator implements ConstraintValidator<OfAgeConstraint, LocalDate> {
    @Override
    public void initialize(OfAgeConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        final int OF_AGE = 18;

        return value != null && ChronoUnit.YEARS.between(value, LocalDate.now()) >= OF_AGE;
    }
}
