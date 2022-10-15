package com.hwh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.reggie.entity.Employee;
import com.hwh.reggie.mapper.EmployeeMapper;
import com.hwh.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author Weihong Hu
 * @version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
