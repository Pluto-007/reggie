package com.hwh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.reggie.entity.AddressBook;
import com.hwh.reggie.mapper.AddressBookMapper;
import com.hwh.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
