package com.example.emos.wx.config;

import com.example.emos.wx.common.util.R;
import com.example.emos.wx.exception.EmosException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理、数据预处理等
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public R validExceptionHandler(BindException e) {
        return R.error(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = EmosException.class)
    @ResponseBody
    public R validExceptionHandler(EmosException e) {
        LOG.warn("业务异常：{}", e.getMsg());
        return R.error(e.getMsg());
    }

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public R validExceptionHandler(Exception e) {
        LOG.error("系统异常：", e);
        return R.error("系统出现异常，请联系管理员");
    }
    @ExceptionHandler(value = UnauthorizedException.class)
    @ResponseBody
    public R validExceptionHandler(UnauthorizedException e) {
        return R.error("不具备相关异常");
    }
}
