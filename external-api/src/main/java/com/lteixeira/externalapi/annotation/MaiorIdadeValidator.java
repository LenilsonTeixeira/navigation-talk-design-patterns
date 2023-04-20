package com.lteixeira.externalapi.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class MaiorIdadeValidator implements ConstraintValidator<MaiorIdade, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext constraintValidatorContext) {
        return value.isBefore(LocalDate.now().minusYears(18));
    }
}
