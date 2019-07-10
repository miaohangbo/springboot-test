package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 54110 on 2019-07-08.
 */
@Mapper
public interface UserMapper {
    List<User> findList();
}
