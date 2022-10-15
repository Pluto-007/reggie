package com.hwh.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.reggie.common.CustomException;
import com.hwh.reggie.entity.Category;
import com.hwh.reggie.entity.Dish;
import com.hwh.reggie.mapper.CategoryMapper;
import com.hwh.reggie.service.CategoryService;
import com.hwh.reggie.service.DishService;
import com.hwh.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper,Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper1 = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper1.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper1);
        if (count1 > 0){
            throw new CustomException("当前分类下关联了菜品，无法删除");
        }

        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper2 = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper2.eq(Dish::getCategoryId,id);
        int count2 = dishService.count(dishLambdaQueryWrapper2);
        if (count2 > 0){
            throw new CustomException("当前分类下关联了套餐，无法删除");
        }

        super.removeById(id);
    }
}
