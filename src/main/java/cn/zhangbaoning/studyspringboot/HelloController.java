package cn.zhangbaoning.studyspringboot;

import cn.zhangbaoning.studyspringboot.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/13
 */
@RestController
public class HelloController {
    @Value("${cupSize}")
    private String cupSize;
    @Value("${content}")
    private String content;
    @Autowired
    private Girl girl;
    @RequestMapping(value = {"hello","hi"},method = RequestMethod.GET)
    public String say(@RequestParam(name = "id",required = false,defaultValue = "10") int id) {
        return "id"+id;
    }
}
