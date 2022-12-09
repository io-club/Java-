package org.example.Commditys;

public class Form
{

    private String[] Table_Top = {"|","Category_Name","|","Features","|","Name","|","Price","|","Num_Sum","|","Numb_Comity","|","Color","|","Classify","|"};


    /*
    * 方法：输入对应的商品，输出对应的信息
    * */
    public void Print_Form(Commdity commdity)
    {
        int j = 0;
        String[] temp = {"|",commdity.Category_Name,"|",commdity.Features,"|","Bluetooth_Laptop","|",commdity.Price,"|",commdity.Num_Sum,"|",commdity.Numb_Comity,"|",commdity.Color,"|",commdity.Classify,"|"};
        int[] tempSize = new int[8];
        for(int i = 1 ; i < temp.length ; i+=2)
        {
            tempSize[j] = temp[i].length();
            j++;
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-5s %s %5s %12s %5s %9s %5s %10s %5s %12s %5s %16s %5s %14s %5s %s %5s %n",Table_Top);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-5s %-13s %5s %12s %5s %9s %5s %10s %5s %12s %5s %16s %5s %14s %5s %s %5s %n",temp);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
