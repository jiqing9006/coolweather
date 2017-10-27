package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * 总的类来引用各个实体类
 * @author jim
 * @date 2017/10/27
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    /**
     * 定义一个List
     */
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
