package cn.zhangbaoning.studyspringboot.enums;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/21
 */
public enum ResultEnum {
    SUCCESS(1,"成功"),
    PRIMARY(100,"你还在上小学吧"),
    MIDDLE(200,"你还在上初中吧");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
