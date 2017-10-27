package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author jim
 */

public class Basic {
    // SerializedName大概是重命名的意思
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    /**
     *  每一个类代表一个json对象
     */
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
