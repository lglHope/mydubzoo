package liu.hope.mydubzoo.service;

import liu.hope.mydubzoo.mapper.CityMapper;
import liu.hope.mydubzoo.pojo.City;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Authou hope
 */
@Service
public class CityService {

    @Resource
    private CityMapper cityMapper;

    private RedisTemplate<String,City> redisTemplate;

    public City getCityById(int id){
        City city = cityMapper.getCityById(id);
        redisTemplate.opsForValue().set(id+"",city);
        return city;
    }

    public List<City> getCities(){
        List<City> cities = cityMapper.getCities();
        return cities;
    }

}
