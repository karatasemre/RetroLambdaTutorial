package emre.com.retrolambdatutorial.utils;

import com.google.gson.Gson;

import java.util.List;

import emre.com.retrolambdatutorial.model.User;

/**
 * Created by Emre.Karatas on 12.10.2018.
 */

public class ConverterManager {
    public static String listToString(List<User> userList) {
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        for (User d : userList) {
            sb.append(gson.toJson(d));
        }
        return sb.toString();
    }

    public static String logString(List<String> userList) {
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        for (String d : userList) {
            sb.append(gson.toJson(d));
        }
        return sb.toString();
    }
}
