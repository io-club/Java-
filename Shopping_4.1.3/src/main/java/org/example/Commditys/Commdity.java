package org.example.Commditys;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.TreeMap;

public class Commdity {

    @JsonProperty(value = "Category_Name")
    protected String Category_Name = null;
    @JsonProperty(value = "Features")
    protected String Features = null;
    @JsonProperty(value = "Name")
    protected String Name = null;
    @JsonProperty(value = "Price")
    protected String Price = null;
    @JsonProperty(value = "Num_Sum")
    protected String Num_Sum = null;

    @JsonProperty(value = "Numb_Comity")
    protected String Numb_Comity = null;

    @JsonProperty(value = "Color")
    protected String Color = null;
    @JsonProperty(value = "Classify")
    protected String Classify = null;






    /*
    *
    * 方法：展示方法：供给单个商品的展示
    * */
    public void CommShow()
    {
        if(this.Category_Name != null)
        {
            System.out.println(" Category_Name is " + this.Category_Name);
        }
        if(this.Features != null)
        {
            System.out.println(" Feature is " + this.Features);
        }
        if(this.Name != null)
        {
            System.out.println("The Name is " + this.Name);
        }

    }


    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        Features = features;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getNum_Sum() {
        return Num_Sum;
    }

    public void setNum_Sum(String num_Sum) {
        Num_Sum = num_Sum;
    }



    public String getClassify() {
        return Classify;
    }

    public void setClassify(String classify) {
        Classify = classify;
    }


    public void NumDelete()
    {
       Integer Num =  Integer.getInteger(this.Num_Sum);
       Num--;
       this.Num_Sum = Num.toString();
    }

    public void NumAdd()
    {
        Integer Num =  Integer.getInteger(this.Num_Sum);
        Num++;
        this.Num_Sum = Num.toString();
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }
}
