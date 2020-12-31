package TP2.DM_POO.controller;

import TP2.DM_POO.OWMapi;
import TP2.DM_POO.apiGeo.Geo;
import TP2.DM_POO.apiMeteo.Meteo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {

    @GetMapping("/meteo")
    public String meteo(Model model) {
        return"meteo";
    }


    @PostMapping("/meteo")
    public String donneeMeteo(@RequestParam String address, Model model){

        Geo reponseGeo = OWMapi.ApiGeo(address);
        model.addAttribute("address", reponseGeo.getFeatures().get(0).getProperties().getLabel());
        double[] coordinate = reponseGeo.getFeatures().get(0).getGeometry().getCoordinates();
        Meteo reponseMeteo = OWMapi.ApiMeteo(coordinate[1],coordinate[0]);
        model.addAttribute("meteo", reponseMeteo.getMain().getTemp());
        return "meteo";
    }
}
