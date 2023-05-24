package com.example.jishixingle.dao;


import com.example.jishixingle.model.Cart;

import java.util.List;

public interface CartDAO {

    //购买后加入购物车
    public boolean updateCartOne(Cart cart);

    //查询订单表全部订单
    public List<Cart> selectCartAll();

    //删除一项订单
    public boolean deleteCartOne(int cart_id);

    //修改订单
//    public boolean updateCart();

    //显示已经购买的订单
    List<Cart> selectCartList(int id);

}
