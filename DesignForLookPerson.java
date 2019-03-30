package com.example.demo8;

import java.util.Observable;

/**
 * 设计模式值观察者模式
 * java util 包中包含基本的Observer 接口和Observable 类
 */
public class DesignForLookPerson extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //无参构造函数
    public DesignForLookPerson(){

    }

    public void measurementsChanged(){
        //调用notifyObservers()之前，要先调用setChanged()来指示状态已经改变
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    //以下只用到get 方法
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

}
