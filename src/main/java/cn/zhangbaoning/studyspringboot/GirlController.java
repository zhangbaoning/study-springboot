package cn.zhangbaoning.studyspringboot;

import cn.zhangbaoning.studyspringboot.entity.Girl;
import cn.zhangbaoning.studyspringboot.entity.ResultDTO;
import cn.zhangbaoning.studyspringboot.service.GirlService;
import cn.zhangbaoning.studyspringboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/19
 */
@RestController
public class GirlController {
    @Autowired
    private GirlService girlService;
    @Autowired
    private GirlJpa girlJpa;

    /**
     * 添加女生信息
     *
     * @param girl
     * @return
     */
    @PostMapping("girl/add")
    public ResultDTO addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
           return ResultUtil.error(100,bindingResult.getFieldError().getDefaultMessage());

        }
        girl.setId(UUID.randomUUID().toString());
        Girl result = girlJpa.save(girl);
        return ResultUtil.success(result);
    }

    @GetMapping("girl/4faf917e-585d-46fd-82f4-c78a6ba3dfb1")
    public String getById(@PathVariable String id) {
        Girl gril = girlJpa.getOne(id);
        return gril.toString();
    }

    @GetMapping("girl/getAll")
    public String getAll() {
        List<Girl> grilList = girlJpa.findAll();
        return grilList.toString();
    }

    @PutMapping("girl/update")
    public String update(@RequestParam("id") String id,
                         @RequestParam("cupSize") String cupSize) {
        Girl girl = girlJpa.getOne(id);
        girl.setCupSize(cupSize);
        girlJpa.save(girl);
        return girl.toString();
    }

    @DeleteMapping("girl/del/{id}")
    public String update(@PathVariable String id) {
        girlJpa.deleteById(id);
        return "1";
    }

    @GetMapping("girl/cupSize/{cupSize}")
    public String findByCupSize(@PathVariable String cupSize) {

        Girl gril = girlJpa.findByCupSize(cupSize);
        return gril.toString();
    }

    @PostMapping("girl/addTwo")
    public void addTwo() {
        girlService.insertTo();
    }

    @GetMapping("girl/getAge/{id}")
    public ResultDTO getAge(@PathVariable String id) throws Exception{
        Girl girl =girlService.getAgeById(id);
       return ResultUtil.success(girl);
    }
}
