package org.example.ShopCart;

import org.example.Commditys.Commdity;

import java.util.TreeMap;

public class ShoppingCatr
{

    //数据结构：存放被删除的订单
    TreeMap<String , Order>Order_Deleted = new TreeMap<String , Order>();


    /*
    *
    * 方法：生成订单方法，这个订单应该是一个对象，其中可以调用它的打印方法
    * */
    Order Create_Order()
    {

        return null;
    }

    /*
    * 将商品加入订单，并且返回商品
    * */
    protected Commdity Add_Com(Commdity commdity)
    {

        return  null;
    }

    /*
    * 清空订单
    * */
    protected void EmptyOrder()
    {

    }

    /*
    * 删除最近添加的商品并返回
    * */
    protected Commdity Delete_NewestCom()
    {

        return null;
    }

    /*
    * 删除对应序号的商品并返回
    * */
    protected Commdity Delete_Commdity(String Num)
    {

        return null;
    }


    /*
    * 方法：打印订单
    * */
    protected void Print_Order()
    {

    }

    /*
    * 方法：输出当前订单的所有商品
    * */
    protected Commdity Output_Order()
    {

        return null;
    }

    /*
    * 方法：删除订单的方法
    * */
    void Delete_Order()
    {

    }

    /*
    * 方法：找回订单的方法
    * 参数：需要输入日期
    * */
    Order Order_Find(String Date)
    {

        return null;
    }

    /*
    * 方法:彻底删除订单
    * 参数：输入日期，彻底删除这个日期之前的订单
    * */
    void Order_Del_Though(String Date)
    {


    }


}
