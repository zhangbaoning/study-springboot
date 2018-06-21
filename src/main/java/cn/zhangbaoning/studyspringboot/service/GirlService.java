package cn.zhangbaoning.studyspringboot.service;

import cn.zhangbaoning.studyspringboot.GirlJpa;
import cn.zhangbaoning.studyspringboot.GirlException;
import cn.zhangbaoning.studyspringboot.entity.Girl;
import cn.zhangbaoning.studyspringboot.enums.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/19
 */
@Service
public class GirlService {
    @Autowired
    private GirlJpa girlJpa;

    @javax.transaction.Transactional
    public void insertTo() {
//        Gril gril = new Gril();
//        gril.setId(UUID.randomUUID().toString());
//        gril.setCupSize("A");
//        gril.setName("zhang");
//        girlJpa.save(gril);
//
//        gril.setId(UUID.randomUUID().toString());
//        gril.setCupSize("CC");
//        gril.setName("zhang");
//        girlJpa.save(gril);

    }

    public Girl getAgeById(String id) throws Exception {

        Girl girl = girlJpa.findById(id).get();

        if (girl.getAge() < 6) {
           throw  new Exception("你还是小孩吧");
        } else if (girl.getAge() > 12 && girl.getAge() < 16) {
            throw  new GirlException(ResultEnum.MIDDLE);
        }
        return girl;
    }
    public Girl getById(String id){
       return girlJpa.findById(id).get();
    }
}
