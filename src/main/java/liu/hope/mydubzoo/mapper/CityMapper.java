package liu.hope.mydubzoo.mapper;

import liu.hope.mydubzoo.pojo.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Authou hope
 */
public interface CityMapper {

    @Select("select * from city where id = #{id}")
    City getCityById(int id);

    @Select("select * from city")
    List<City> getCities();

}
