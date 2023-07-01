package com.example.MapApi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.MapApi.Location;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

    @GetMapping("/")
    public String getMap(Model model) {
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(37.7749, -122.4194, "San Francisco"));
        locations.add(new Location(34.0522, -118.2437, "Los Angeles"));
        locations.add(new Location(40.7128, -74.0060, "New York"));

        model.addAttribute("locations", locations);
        return "map";
    }
}