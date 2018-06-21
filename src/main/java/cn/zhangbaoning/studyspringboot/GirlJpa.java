package cn.zhangbaoning.studyspringboot;

import cn.zhangbaoning.studyspringboot.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/19
 */
public interface GirlJpa extends JpaRepository<Girl,String> {
      Girl findByCupSize(String cupSize);
}
