package org.example.Commditys;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.TreeMap;

public class Shop_Category extends Commdity
{



    @JsonProperty(value = "CategoryMap")
    public TreeMap<String , Shop_Features>CategoryMap = new TreeMap<String , Shop_Features>();


    //public TreeMap<String , Shop_Features>CategoryMap;


}
