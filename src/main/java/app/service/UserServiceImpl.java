package app.service;

import app.mapper.UserMapper;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;


    //添加一条数据
    public int add(User user) {
        return userMapper.insert(user);
    }
    //添加多条数据
    public void add(List<User> users) {
        for (User user : users) {
            add(user);
        }
    }

    public List<User> queryAll() {
        return userMapper.selectList(null);
    }
}