package liu.hope.mydubzoo.mapper;

import liu.hope.mydubzoo.base.BaseMapper;
import liu.hope.mydubzoo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户
     * @param username
     * @param password
     * @return
     */
    @Select("select * from t_user where username = #{username} and password = #{password}")
    User selectByUsername(@Param("username") String username, @Param("password") String password);

    /**
     * 检测用户名称
     * @param username
     * @param id
     * @return
     */
    Integer checkUsername(@Param("username") String username, @Param("id") Integer id);

    @Select("select u.* from t_user u left join t_token t on u.id = t.user_id where access_token = #{token}")
    User selectByToken(@Param("token") String token);
}
