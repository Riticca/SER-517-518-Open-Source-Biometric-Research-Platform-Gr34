/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricgui;

/**
 * Shared data class contains data shared between different objects in GUI
 *
 * @author Vikram Wathodkar (vikram.wathodkar@gmail.com)
 */
public class SharedData {

    public SharedData() {

        /* Slider status true indicates it is running */
        sliderStatus = true;
    }

    public static SharedData getSharedDataInstance() {

        /* Make SharedData singleton */
        if (instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public synchronized void set(int newVal) {
        sliderValue = newVal;
    }

    public synchronized int get() {
        return sliderValue;
    }

    public synchronized boolean getSliderStatus() {
        return sliderStatus;
    }

    public synchronized void setSliderStatus(boolean status) {
        sliderStatus = status;
    }

    private int sliderValue;
    private static SharedData instance;
    private boolean sliderStatus;
}
