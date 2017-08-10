package com.leyuta.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * 异常处理器 异常统一处理
 *
 * @author listen
 * @date 2017/08/10 10:22
 */
@ControllerAdvice
public class ExceptionHandle
{

    @ExceptionHandler(value = Exception.class) // 异常类型
    public void handle()
    {

    }
}
