package com.atguigu.service.impl;

import com.atguigu.dao.CustomerDao;
import com.atguigu.domain.Customer;
import com.atguigu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    RedisTemplate redisTemplate;//操作任何类型

    @Autowired
    private StringRedisTemplate stringRedisTemplate;//操作string类型

    @Override
    public List<Customer> findCustomers() {
        String key = "allcustomer";
        List<Customer> customers = (List<Customer>) redisTemplate.boundValueOps(key).get();
        if (customers != null) {//判断如果redis，如果不为空就在redis取，为空就在数据库取
            System.out.println(customers);
            return customers;
        }
        customers = customerDao.findAll();
        redisTemplate.boundValueOps(key).set(customers);
        System.out.println(customers);
        return customers;
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customerDao.getOne(id);
    }

    @Override
    public void saveCustomer(Customer c) {
        customerDao.save(c);//Oid无id就按save
    }

    @Override
    public void updateCustomer(Customer c) {
        customerDao.save(c);//Oid有id就按update
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerDao.deleteById(id);
    }
}
