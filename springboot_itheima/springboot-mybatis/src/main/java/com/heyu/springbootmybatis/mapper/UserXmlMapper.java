package com.heyu.springbootmybatis.mapper;

import com.heyu.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @date 2021-08-15 15:34
 */
@Mapper
@Repository
public interface UserXmlMapper {

    public List<User> findAll();
}
