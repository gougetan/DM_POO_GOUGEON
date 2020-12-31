package TP2.DM_POO;

import TP2.DM_POO.apiGeo.Geo;
import TP2.DM_POO.apiMeteo.Meteo;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class OWMapi {

    private final static String apiKey = "d2d637db89ffb30e693b97947b139c43";

    @Bean
    public static Geo ApiGeo(String address) {
        return new RestTemplate().getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address, Geo.class);
    }
    @Bean
    public static Meteo ApiMeteo(double lat, double lon){
        return new RestTemplate().getForObject(
                "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey + "&units=metric", Meteo.class);

    }
}
