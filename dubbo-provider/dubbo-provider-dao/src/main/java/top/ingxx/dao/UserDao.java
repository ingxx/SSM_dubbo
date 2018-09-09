package top.ingxx.dao;

import top.ingxx.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();
}
