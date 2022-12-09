package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Commditys.Commdity;
import org.example.Commditys.Form;
import org.example.Commditys.Shop_Category;
import org.example.Commditys.Shop_Features;
import org.example.Mall.Mall;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        Mall mall = new Mall();
        //TreeMap<String , Shop_Category>treeMap = new TreeMap<String , Shop_Category>();
        //TreeMap<String , TreeMap<String , List<Commdity>>>treeMap = new TreeMap<String , TreeMap<String, List<Commdity>>>();

        File file = new File("C:\\IDE_Project_JAVA\\Shopping_4.1\\src\\main\\java\\org\\example\\Goods.txt");

        Form form = new Form();


        try {
            mall.MallMap = objectMapper.readValue(file,new TypeReference<TreeMap<String , Shop_Category>>(){});

        } catch (IOException e) {
            e.printStackTrace();
        }

        Commdity laptop = mall.MallMap.get("A02").CategoryMap.get("B000").FeatureMap.get("C000");
        Shop_Category electronic = mall.MallMap.get("A02");
        Shop_Features computer = electronic.CategoryMap.get("B000");
        electronic.CommShow();
        computer.CommShow();
        laptop.CommShow();



        Commdity com =  mall.FindCommdity("02000000");
        System.out.println("Out is " + com.getName());
        System.out.println("Hello world!");
        form.Print_Form(com);
    }
}