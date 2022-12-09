package org.example.Commditys;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.TreeMap;

public class Shop_Features extends Commdity
{

    @JsonProperty(value = "FeatureMap")
    public TreeMap<String , Commdity>FeatureMap = new TreeMap<String , Commdity>();


}
