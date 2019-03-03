package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {

    private Map<String,String> routes =new TreeMap<>();

    public void add(String path, String controller) {

     routes.put(path, controller);
    }

    public Integer size() {

        return routes.size();
    }

    public String getController(String path) {

        return routes.get(path);
    }

    public void update(String path, String studentController) {
        routes.put(path,studentController);
    }

    public void remove(String path) {
        routes.remove(path);
    }
    @Override
    public String toString(){
        String result = "";
        Set<Map.Entry<String, String>> entries = routes.entrySet();

        for(Map.Entry<String, String> e : entries ) {
            String format = e.getKey() + " -> " + e.getValue() + "\n";
            result += format;
        }

        return  result;
    }
}
