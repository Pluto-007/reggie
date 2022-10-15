package com.hwh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.reggie.entity.ShoppingCart;
import com.hwh.reggie.mapper.ShoppingCartMapper;
import com.hwh.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
