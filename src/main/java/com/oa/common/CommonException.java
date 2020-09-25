package com.oa.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Iterator;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/25 15:25
 * @Description: 全局异常处理类
 */
@ControllerAdvice  // 该注解也需要扫描
@ResponseBody  // 修饰类，类中的所有方法，相当于都使用该注解修饰
public class CommonException {

    @ExceptionHandler(ConstraintViolationException.class)//修饰方法，表示的是一个异常处理方法
    //返回一个json数据
    @ResponseBody
    public JsonResult ConstraintViolationException(ConstraintViolationException ex){
        Iterator<ConstraintViolation<?>> iterator = ex.getConstraintViolations().iterator();
        String message = null;
        if (iterator.hasNext()) {
            message = iterator.next().getMessage();
            System.out.println("message = " + message);
        }
        return new JsonResult(0,message);
    }

    /**
     * 处理那些没有遇到的异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public JsonResult CommonException(Exception ex){
        return new JsonResult(0,ex.getMessage());
    }

}
