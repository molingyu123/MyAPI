package com.example.demo8;

public class WeatherStation {
    public static void  main(String[]args){
        DesignForLookPerson designForLookPerson = new DesignForLookPerson();
        CurrentConditionDisplayNew currentConditionDisplayNew = new CurrentConditionDisplayNew(designForLookPerson);
        designForLookPerson.setMeasurements(80,65,30.4f);
    }
}
