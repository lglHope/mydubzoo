package liu.hope.mydubzoo.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 殷帅
 * @version 1.0
 * @Description: 公共抽取服务层的实现
 * @date 2016年7月16日
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取mapper
     *
     * @return
     */
    public abstract BaseMapper<T> getMapper();

    /**
     * 插入
     *
     * @param entity
     * @return
     */
    @Override
    public Integer insert(T entity) {
        entity.setInsertTime(new Date());
        getMapper().insert(entity);
        return entity.getId();
    }

    /**
     * 根据id删除
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        getMapper().delete(id);
    }

    /**
     * 根据ids批量删除
     *
     * @param idsStr
     */
    @Override
    public void deleteByIds(String idsStr) {

    }

    /**
     * 更新
     *
     * @param entity
     * @throws Exception
     */
    @Override
    public void update(T entity) {
        entity.setUpdateTime(new Date());
        getMapper().update(entity);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public Map selectById(Integer id) {
        return getMapper().selectById(id);
    }

    /**
     * 根据id查询实体
     *
     * @param id
     * @return
     */
    @Override
    public T selectEntityById(Integer id) {
        return getMapper().selectEntityById(id);
    }


    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List selectAll() {
        return getMapper().selectAll();
    }


}