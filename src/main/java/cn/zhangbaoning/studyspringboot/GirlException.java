package cn.zhangbaoning.studyspringboot;

import cn.zhangbaoning.studyspringboot.enums.ResultEnum;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/20
 */
// Spring只对RuntimeException进行事务回滚
public class GirlException extends RuntimeException {
    private int code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
