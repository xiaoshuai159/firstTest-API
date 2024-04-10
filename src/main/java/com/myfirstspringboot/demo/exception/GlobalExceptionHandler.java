package com.myfirstspringboot.demo.exception;

import com.myfirstspringboot.demo.pojo.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 参数校验失败异常处理
@RestControllerAdvice // 全局异常处理的注解。它结合了 @ControllerAdvice 和 @ResponseBody 注解的功能
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)  // 异常处理方法的注解。它指定了该方法可以处理所有类型的 Exception 异常，即捕获应用程序中抛出的任何异常。
    public Result handleException(Exception e){
        e.printStackTrace();  // 将异常的堆栈信息打印到控制台的语句
        return Result.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");
    }
}
