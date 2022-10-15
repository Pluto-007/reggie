package com.hwh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.reggie.entity.DishFlavor;
import com.hwh.reggie.mapper.DishFlavorMapper;
import com.hwh.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
