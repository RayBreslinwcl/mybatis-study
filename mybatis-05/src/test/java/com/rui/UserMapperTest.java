package com.rui;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import rui.dao.UserMapper;
import rui.pojo.User;
import rui.utils.MyBatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      /*  List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }*/
      /*  User user = mapper.getUserByID(1, "狂神");
        System.out.println(user);*/
//        mapper.addUser(new User(5,"Hello","123123"));
//        mapper.updateUser(new User(5,"to","21231"));
//        mapper.deleteUser(5);
//        sqlSession.close();

        //==================add
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }

        mapper.addUser(new User(8,"Hello","123123"));

        sqlSession.close();
    }
}
