package com.example.jishixingle.daoimpl;

import com.example.jishixingle.dao.CartDAO;
import com.example.jishixingle.mapper.CartMapper;
import com.example.jishixingle.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDAOImpl implements CartDAO {

    @Autowired
    CartMapper cartMapper;

    @Override
    public boolean updateCartOne(Cart cart) {
        return cartMapper.updateCartOne(cart);
    }

    @Override
    public List<Cart> selectCartAll() {
        return cartMapper.selectCartAll();
    }

    @Override
    public boolean deleteCartOne(int cart_id) {
        return cartMapper.deleteCartOne(cart_id);
    }

    @Override
    public List<Cart> selectCartList(int id) {
        return cartMapper.selectCartList(id);
    }

    @Override
    public boolean updateCartAll() {
        return cartMapper.updateCartAll();
    }
}
