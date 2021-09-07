package me.chichu.main;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Config {

    private final JSONObject jsonObject;

    public Config(){

        Object obj = null;
        try {
            JSONParser parser = new JSONParser();
            obj = parser.parse(new FileReader("D:\\DiscordBot\\config.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

    }

    public String getToken(){

        return (String) jsonObject.get("token");

    }

    public String getPrefix(){

        return (String) jsonObject.get("prefix");

    }

    public String getActivity(){

        return (String) jsonObject.get("presence");

    }

    public String getOwner(){

        return (String) jsonObject.get("owner");

    }

    public String getServer(){

        return (String) jsonObject.get("server");

    }


}
