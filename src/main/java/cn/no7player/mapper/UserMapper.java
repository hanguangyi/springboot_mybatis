package cn.no7player.mapper;

import cn.no7player.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
@Component
@Mapper
public interface UserMapper {
    @Select(value = "select * from shop_craft where status = 1 and end_time > 1533026929")
    List<User> findUserInfo();
}
