package org.example.Mall;

import org.example.Commditys.Commdity;
import org.example.Commditys.Form;
import org.example.Commditys.Shop_Category;
import org.example.Commditys.Shop_Features;

import java.util.*;

public class Mall
{
    public TreeMap<String , Shop_Category>MallMap = new TreeMap<String , Shop_Category>();



    /*
    * 方法：展示所有商品
    * */
    public void FindAll()
    {
        Form form = new Form();
        List<Shop_Features[]>FeatList = new ArrayList<>();

        System.out.println("现在将输出所有商品");
        Shop_Category[] AllCat = this.MallMap.values().toArray(new Shop_Category[0]);

        for(int i = 0 ; i < AllCat.length ; i++)
        {   //将所有遍历出来的featArray都存放到List中
            Shop_Features[] AllFeat = AllCat[i].CategoryMap.values().toArray(new Shop_Features[0]);
            FeatList.add(AllFeat);
        }

        for (int i = 0 ; i < FeatList.size() ; i++)
        {
            Shop_Features[] temp = FeatList.get(i);
            for (int j = 0 ; j < temp.length ; j++)
            {
                form.Print_Form(temp[j]);
            }
        }

    }

    /*
     *
     * 方法：输入一个给定的商品编码，然后输出给定的商品信息，并返回对应的商品对象
     * */
    public Commdity FindCommdity(String HexNumber)
    {

        Form form = new Form();

        if (HexNumber.length() < 8)
        {
          HexNumber = "0" + HexNumber;
            System.out.println("HEXNEMBER IS " + HexNumber);
        }

        //查找防止错误的商品码进入判断
        if(HexNumber.length() != 8)
        {
            System.out.println("Code Length is not right ");
            System.out.println("000");
            return null;
        }

        //第一层的代码为两位;故剪切头两位
        String OneFloorCode =  HexNumber.substring(0,2);
        String TwoFloorCode = HexNumber.substring(2,5);
        String ThreeFloorCode = HexNumber.substring(5 , 8);
        System.out.println("One is" + OneFloorCode +  "  Two is " + TwoFloorCode + " Three is " + ThreeFloorCode);

        try {
            Commdity outcome =  this.MallMap.get("A"+OneFloorCode).CategoryMap.get("B"+TwoFloorCode).FeatureMap.get("C"+ThreeFloorCode);
            form.Print_Form(outcome);

            return outcome;
        }catch (Exception e)
        {
            System.out.println("There is no shopping");
            System.out.println("001");
            return null;
        }





    }

}
