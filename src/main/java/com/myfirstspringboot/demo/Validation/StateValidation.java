package com.myfirstspringboot.demo.Validation;

import com.myfirstspringboot.demo.anno.State;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // 提供校验规则
        if(value == null){
            return false;
        }
        if(value.equals("已发布")||value.equals("草稿")){
            return true;
        }
        return false;
    }
}
