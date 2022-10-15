package com.hwh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwh.reggie.dto.SetmealDto;
import com.hwh.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author Weihong Hu
 * @version 1.0
 */
public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List ids);
}
