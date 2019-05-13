/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Database;

import com.mycompany.mavenproject1.model.Messege;
import com.mycompany.mavenproject1.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class DBClass {

    private static Map<Long, Messege> Messege = new HashMap<>();
    private static Map<Long, Profile> Profile = new HashMap<>();

    public static Map<Long, Messege> getMessages() {
        return Messege;
    }

    public static Map<Long, Profile> getProfiles() {
        return Profile;
    }

}
