package cn.zhangbaoning.studyspringboot.entity;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/20
 */
public class ResultDTO<T> {
    /**
     * 异常码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
