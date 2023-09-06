package com.niehao.handler;

import com.niehao.error.AccountOrPasswordErrorException;
import com.niehao.http.HttpResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class CommHandler {

    @ExceptionHandler(AccountOrPasswordErrorException.class)
    public HttpResult<Map<String, Object>> error(Throwable e) {
        return HttpResult.FAIL(e.getLocalizedMessage());
    }

}
