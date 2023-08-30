package com.pov.design.patterns.observer;

import com.pov.design.patterns.behavioral.observer.Observer;
import com.pov.design.patterns.behavioral.observer.TemperatureDisplay;
import com.pov.design.patterns.behavioral.observer.WeatherStation;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WeatherStationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    public WeatherStation weatherStation;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeAll
    public void setUp(){
        weatherStation = new WeatherStation();
        Observer temperatureDisplay1=new TemperatureDisplay();
        Observer temperatureDisplay2=new TemperatureDisplay();
        weatherStation.registerObserver(temperatureDisplay1);
        weatherStation.registerObserver(temperatureDisplay2);
    }

    @Test
    public void testNotifyObserversMethod(){
        weatherStation.setTemperature(100);
        Assertions.assertEquals(100,outContent);
    }
}
