package org.example.ShopCart;

import org.example.Commditys.Commdity;

import java.util.TreeMap;

public class Order
{

    private TreeMap<Integer , Commdity> order = new TreeMap<Integer, Commdity>(); //订单类
    private int freq_Num = 0; //记录订单的商品序号，从0开始

    /*
    * 打印自身，给购物车这个类调用的基本方法
    * */
    protected void Order_Print()
    {

    }

    /*
    * 方法：输出自身
    * 结果为输出其中结构存放的所有商品
    * */
    protected Commdity Out_Oredr()
    {

        return null;
    }


    /*
    * 添加商品：将商品添加到自身中并返回商品
    * 参数：商品对象
    * */
    protected Commdity  AddCom(Commdity commdity)
    {

        return null;
    }

    /*
    * 删除商品：将商品删除并且返回商品
    * 参数：商品在表格中的序号
    * */
    protected Commdity DeletCom(int Num)
    {

        return null;
    }

    /*
    * 对商品进行排序
    * */
    private void Sort_Com()
    {

    }


    public int getFreq_Num() {
        return freq_Num;
    }

    public void setFreq_Num(int freq_Num) {
        this.freq_Num = freq_Num;
    }

    public TreeMap<Integer, Commdity> getOrder() {
        return order;
    }

    public void setOrder(TreeMap<Integer, Commdity> order) {
        this.order = order;
    }
}
