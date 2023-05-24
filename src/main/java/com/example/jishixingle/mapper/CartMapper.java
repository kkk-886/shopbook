package com.example.jishixingle.mapper;

import com.example.jishixingle.model.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CartMapper {

    //购买后加入购物车
    @Insert("insert into cart(cart_name,cart_scj,cart_yhj,num,cart_num,shdz,shr,iphone,book_id,id,cart_order_number,cart_date,cart_static_id) " +
            "values(#{cart_name},#{cart_scj},#{cart_yhj},#{num},#{cart_num},#{shdz},#{shr},#{iphone},#{book_id},#{id},#{cart_order_number}" +
            ",#{cart_date},#{cart_static_id})")
    public boolean updateCartOne(Cart cart);

    //查询订单表全部订单
    @Select("select * from cart where cart_static_id = 3")
    public List<Cart> selectCartAll();

    //删除一项订单
    @Delete("delete from cart where cart_id = #{cart_id}")
    public boolean deleteCartOne(int cart_id);

    //显示已经购买的订单
    @Select("select * from cart c inner join cart_static cc on  c.cart_static_id = cc.cart_static_id and c.cart_static_id != 3 and id = #{id}")
    List<Cart> selectCartList(int id);

}
