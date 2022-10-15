package com.hwh.reggie.dto;

import com.hwh.reggie.entity.Setmeal;
import com.hwh.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
