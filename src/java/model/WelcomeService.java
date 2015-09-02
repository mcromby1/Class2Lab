/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author user test
 */
public class WelcomeService {

    private enum TimeOfDay {

        Morning, Afternoon, Evening
    }

    private TimeOfDay getCurrentTime() {
        Date date = new Date();

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        System.out.println(hour);

        if (hour > 20 && hour < 4) {
            return TimeOfDay.Evening;
        } else if (hour > 4 && hour < 12) {
            return TimeOfDay.Morning;
        } else if (hour > 12 && hour < 20) {
            return TimeOfDay.Afternoon;
        } else {
            return null;
        }
    }

    public String getGreeting(String name) {
        TimeOfDay now = getCurrentTime();
        System.out.println(now);
        return "Good " + now.toString() + " " + name;

    }

}
