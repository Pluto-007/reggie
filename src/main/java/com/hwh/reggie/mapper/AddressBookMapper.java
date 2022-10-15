package com.hwh.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hwh.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
