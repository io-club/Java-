package org.example.ShopCart;

import org.example.Commditys.Commdity;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ShoppingCatr
{

    //数据结构：存放被删除的订单
    TreeMap<String , Order>Order_Deleted = new TreeMap<String , Order>();

    //数据结构：存放商品
    List<Commdity>CarCom_List = new ArrayList<>();

    //目前购物车中的订单
    public Order order = null;

    /*
    * 方法：提交并生成订单的方法
    * */
    public Order PutOrder()
    {
        if (this.order == null){
            System.out.println("获取失败，没有订单");
            return null;
        }
        System.out.println("订单已生成，获取成功");
        return this.order;
    }

    /*
    *
    * 方法：生成订单方法，这个订单应该是一个对象，其中可以调用它的打印方法
    * */
    Order Create_Order()
    {
        if(this.order != null)
        {
            System.out.println("订单已经创建,自动退出");
            return null;
        }
        Order order_t = new Order();
        this.order = order_t;
        System.out.println("订单创建成功");
        return null;
    }

    /*
    * 将商品加入订单，并且返回商品
    * */
    protected Commdity Add_Com(Commdity commdity)
    {
        if(this.order == null)
        {
            System.out.println("订单为空，正在为您自动创建订单");
            //可以考虑在这里加上是否需要使用以前的订单
            this.Create_Order();
        }

        if(commdity == null)
        {
            System.out.println("商品输入有误，商品为空，无法添加！已自动退出");
            return null;
        }
        if(commdity.getNum_Sum() == null || Integer.getInteger(commdity.getNum_Sum()) <= 0)
        {
            System.out.println("错误，商品目前没货");
            return null;
        }

        commdity.NumDelete();
        Commdity ctemp = commdity;
        ctemp.setNum_Sum("1");

        //注意：如果Tree连续添加商品的话，会报错

        Commdity  out =  this.order.AddCom(commdity);

        return  commdity;
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
    * 方法：查看订单：输出订单信息
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
