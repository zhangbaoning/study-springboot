package cn.zhangbaoning.studyspringboot.handle;

import cn.zhangbaoning.studyspringboot.GirlException;
import cn.zhangbaoning.studyspringboot.entity.ResultDTO;
import cn.zhangbaoning.studyspringboot.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/20
 */
@ControllerAdvice
public class ExceptionHandle {
    //Exception.class：捕获的类
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultDTO handle(Exception e){
        if (e instanceof GirlException){
            GirlException girlExcep = (GirlException) e;
        return ResultUtil.error(girlExcep.getCode(),girlExcep.getMessage());
        }else {
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
