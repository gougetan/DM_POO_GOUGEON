package TP2.DM_POO.apiMeteo;

import java.util.List;

public class Meteo {

    private Main main;
    private Clouds cloud;
    private List<Weather> weatherList;
    private float visibility;
    private Wind wind;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Clouds getCloud() {
        return cloud;
    }

    public void setCloud(Clouds cloud) {
        this.cloud = cloud;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
