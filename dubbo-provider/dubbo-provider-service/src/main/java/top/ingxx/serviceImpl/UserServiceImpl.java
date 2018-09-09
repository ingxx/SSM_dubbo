package top.ingxx.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ingxx.dao.UserDao;
import top.ingxx.pojo.User;
import top.ingxx.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
