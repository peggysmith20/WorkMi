package com.example.matt.workmi;

import android.content.Context;
import android.content.SharedPreferences;

public class UserLocalStorage {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStorage(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user){
        SharedPreferences.Editor sp_Editor = userLocalDatabase.edit();
        sp_Editor.putString("name", user.name);
        sp_Editor.putString("employeeid", user.employeeid);
        sp_Editor.putString("password", user.password);
        sp_Editor.commit();
    }

    //Returns user
    public User getLoggedInUser(){
        String name = userLocalDatabase.getString("name","");
        String employeeid = userLocalDatabase.getString("employeeid","");
        String password = userLocalDatabase.getString("password","");

        User storedUser = new User(name, employeeid, password);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor sp_Editor = userLocalDatabase.edit();
        sp_Editor.putBoolean("loggedIn", loggedIn);
        sp_Editor.commit();
    }


    public boolean getUserLoggedIn(){
        if (userLocalDatabase.getBoolean("loggedIn",false) == true){
            return true;
        }else {
            return false;
        }
    }
    public void clearUserData(){
        SharedPreferences.Editor sp_Editor = userLocalDatabase.edit();
        sp_Editor.clear();


    }
}
