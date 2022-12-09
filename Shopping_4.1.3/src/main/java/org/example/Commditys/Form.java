package org.example.Commditys;

import static java.lang.Math.max;

public class Form
{

    private String[] Table_Top = {"|","Category_Name","|","","Features","|","","Name","|","","Price","|","","Num_Sum","|","","Numb_Comity","|","","Color","|","","Classify","|"};


    /*
    * 方法：输入对应的商品，输出对应的信息
    * */
    public void Print_Form(Commdity commdity)
    {
        int allLength = 0;
        int j = 0;


        String[] temp = {"|",commdity.Category_Name,"|","",commdity.Features,"|","","Bluetooth_Laptop","|","",commdity.Price,"|","",commdity.Num_Sum,"|","",commdity.Numb_Comity,"|","",commdity.Color,"|","",commdity.Classify,"|"};
        int[] tempSize = new int[8];
        int[] Table_Size = {13,8,4,5,7,11,5,8};
        for(int i = 1 ; i < temp.length ; i+=3)
        {
            int Size_Test = 0;
            try {
                Size_Test = temp[i].length();
            }catch (Exception e)
            {
                Size_Test = -1 ;
            }

            tempSize[j] = max(Size_Test,Table_Size[j]);
            allLength+=tempSize[j];
            j++;

        }

        System.out.println("-".repeat(103 + allLength));
        System.out.format("%-5s %-"+ tempSize[0] + "s %5s %5s %-"+ tempSize[1] +"s %5s %5s %-"+ tempSize[2] +"s %5s %5s %-"+ tempSize[3] +"s %5s %5s %-"+ tempSize[4] +"s %5s %5s %-"+ tempSize[5] +"s %5s %5s %-"+ tempSize[6] +"s %5s %5s %-"+ tempSize[7] +"s %5s  %n",Table_Top);
        System.out.println("-".repeat(103 + allLength));
        System.out.format("%-5s %-"+ tempSize[0] + "s %5s %5s %-"+ tempSize[1] +"s %5s %5s %-"+ tempSize[2] +"s %5s %5s %-"+ tempSize[3] +"s %5s %5s %-"+ tempSize[4] +"s %5s %5s %-"+ tempSize[5] +"s %5s %5s %-"+ tempSize[6] +"s %5s %5s %-"+ tempSize[7] +"s %5s %n",temp);
        System.out.println("-".repeat(103 + allLength));
    }


}
