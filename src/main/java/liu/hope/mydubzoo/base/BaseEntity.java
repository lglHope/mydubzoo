package liu.hope.mydubzoo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 殷帅
 * @version 1.0
 * @Description: 实体基类
 * @date 2016年7月16日
 */
public class BaseEntity implements Serializable {

    /**
     * 主键id
     */
    private Integer id;
    /**
     * 录入人
     */
    private Integer inserter;
    /**
     * 录入时间
     */
    private Date insertTime;
    /**
     * 更新人
     */
    private Integer updater;
    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInserter() {
        return inserter;
    }

    public void setInserter(Integer inserter) {
        this.inserter = inserter;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getUpdater() {
        return updater;
    }

    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}
