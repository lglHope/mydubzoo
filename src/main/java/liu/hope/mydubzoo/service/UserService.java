package liu.hope.mydubzoo.service;

import liu.hope.mydubzoo.base.BaseMapper;
import liu.hope.mydubzoo.base.BaseServiceImpl;
import liu.hope.mydubzoo.mapper.UserMapper;
import liu.hope.mydubzoo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService extends BaseServiceImpl<User> {

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseMapper<User> getMapper() {
        return userMapper;
    }

    /**
     * 根据用户名查询用户
     * @param username
     * @param password
     * @return
     */
    public boolean selectByUsername(String username,String password) {
        User user = userMapper.selectByUsername(username, password);
        if (user != null){
            return true;
        }
        return false;
    }

    /**
     * 检测用户账号是否重复
     * @param username
     * @param id
     * @return
     */
    public Integer checkUsername(String username, Integer id) {
        return userMapper.checkUsername(username,id);
    }


    public User selectByToken(String token){
        User user = userMapper.selectByToken(token);
        return user;
    }

}
