package com.example.demo8;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayNew implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;


    // 3：构造器需要 Observable当参数，并将 CurrentConditionsDisplay对象登记成观察者
    public CurrentConditionDisplayNew(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  DesignForLookPerson){
           DesignForLookPerson designForLookPerson = (DesignForLookPerson)o;
           this.temperature = designForLookPerson.getTemperature();
           this.humidity = designForLookPerson.getHumidity();
           display();
        }
    }

    public  void display(){
        System.out.println("Current conditions:"+temperature +"F degrees and"+humidity +"% humidity");
    }
}
