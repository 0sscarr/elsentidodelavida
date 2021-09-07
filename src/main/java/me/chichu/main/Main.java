package me.chichu.main;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    private static final Config config = new Config();
    private static JDA jda;


    public static void main(String[] args) throws InterruptedException, LoginException {

        jda = JDABuilder.createDefault(config.getToken())
                .setActivity(Activity.of(Activity.ActivityType.WATCHING,config.getActivity()))
                .build();
        jda.awaitReady();

    }

    public static Config getConfig(){
        return config;
    }

    public static JDA getJda(){
        return jda;
    }

}
