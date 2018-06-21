package cn.zhangbaoning.studyspringboot.util;

import cn.zhangbaoning.studyspringboot.entity.ResultDTO;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/20
 */
public class ResultUtil {
    public static ResultDTO success(Object data){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(1);
        resultDTO.setMsg("成功");
        resultDTO.setData(data);
        return resultDTO;
    }
    public static ResultDTO error(int code ,String msg){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMsg(msg);
        resultDTO.setData(null);
        return resultDTO;
    }
}
