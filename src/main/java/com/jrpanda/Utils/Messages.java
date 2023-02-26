package com.jrpanda.Utils;

public class Messages {

    public static final String prefix = Helper.toColor("&r&l[&6&oSurvival&r&l]");
    public static final String
        mustBePlayer = format("&cOnly player may use this command!"),
        noPermissions = format("&cYou do not have permissions to run this command!");


    private static String format(String msg){
        return prefix + Helper.toColor(msg);
    }
}
