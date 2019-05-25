package com.zhf.shopping.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler({Exception.class})    //申明捕获那个异常类
    public ResponseResultVO globalExceptionHandler(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return new ResponseResultUtil().error(ResponseCodeEnum.OPERATE_FAIL);
    }


    @ExceptionHandler({BasicException.class})
    public ResponseResultVO BusinessExceptionHandler(BasicException e) {
        LOGGER.error(e.getMessage(), e);
        return new ResponseResultUtil().error(e.getCode(), e.getMessage());
    }
}
