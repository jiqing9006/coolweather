package android.coolweather.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author jim
 */

public class HttpUtil {
    /**
     * OkHttpClient 封装的特别棒，很方便的处理接口请求发送
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
