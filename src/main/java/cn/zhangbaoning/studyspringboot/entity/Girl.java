package cn.zhangbaoning.studyspringboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/14
 */
@Component
@ConfigurationProperties(prefix = "girl")
@Entity
public class Girl {
    @Id
    private String id;

    /**
     * 对年龄进行校验，加以限制
     */
    @Min(value = 18, message = "未成年人不得入内")
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String cupSize;


    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "age='" + age + '\'' +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
