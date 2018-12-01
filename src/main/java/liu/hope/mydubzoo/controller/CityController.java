package liu.hope.mydubzoo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import liu.hope.mydubzoo.pojo.City;
import liu.hope.mydubzoo.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Authou hope
 */
@RestController
@Api(value = "city", description = "获取国家信息的类")
public class CityController {

    @Resource
    private CityService cityService;


    @GetMapping("/city/getCityById")
    @ApiImplicitParam(name = "id", value = "国家ID" ,required = true, paramType = "query")
    public City getCityById(@RequestParam Integer id){
        City city = cityService.getCityById(id);
        return city;
    }

    @GetMapping("/city/getCities")
    public List<City> getCities(){
        List<City> cities = cityService.getCities();
        return cities;
    }

    @GetMapping("/city/getCityById2/{id}")
    @ApiImplicitParam(name = "id", value = "国家ID" ,required = true,paramType = "path")
    public City getCityById2(@PathVariable(value = "id") Integer id){
        City city = cityService.getCityById(id);
        return city;
    }

}
