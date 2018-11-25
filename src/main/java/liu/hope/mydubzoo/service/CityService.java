package liu.hope.mydubzoo.service;

import liu.hope.mydubzoo.mapper.CityMapper;
import liu.hope.mydubzoo.pojo.City;
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

    public City getCityById(int id){
        City city = cityMapper.getCityById(id);
        return city;
    }

    public List<City> getCities(){
        List<City> cities = cityMapper.getCities();
        return cities;
    }

}
