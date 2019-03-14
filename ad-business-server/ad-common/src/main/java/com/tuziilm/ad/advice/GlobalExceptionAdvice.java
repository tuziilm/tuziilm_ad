package com.tuziilm.ad.advice;

import com.tuziilm.ad.exception.AdException;
import com.tuziilm.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: <a href="tuziilm@gmail.com">tuziilm</a>
 * @Date 2019/3/14
 **/
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerException(HttpServletRequest request,
                                                   AdException e) {
        CommonResponse<String> commonResponse = new CommonResponse<>(-1, "business error");
        commonResponse.setData(e.getMessage());
        return commonResponse;
    }
}
