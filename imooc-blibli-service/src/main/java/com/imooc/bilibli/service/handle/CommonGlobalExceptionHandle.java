package com.imooc.bilibli.service.handle;

import com.imooc.bilibli.dao.domain.JsonResponse;
import com.imooc.bilibli.dao.exception.ConditionalException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CommonGlobalExceptionHandle {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResponse<String> commonHandle(HttpServletRequest request, Exception e) {

        if (e instanceof ConditionalException) {

            return JsonResponse.fail(((ConditionalException) e).getCode(), ((ConditionalException) e).getMessage());
        } else {
            return JsonResponse.fail(500, e.getMessage());
        }


    }

}
