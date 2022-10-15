package com.hwh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwh.reggie.entity.Orders;

/**
 * @author Weihong Hu
 * @version 1.0
 */
public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
