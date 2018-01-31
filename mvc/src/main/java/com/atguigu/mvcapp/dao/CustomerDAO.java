package com.atguigu.mvcapp.dao;

import java.util.List;

import com.atguigu.mvcapp.domain.Customer;

public interface CustomerDAO {

    /**
     * 返回满足查询条件的 List
     * @param cc: 封装了查询条件
     * @return
     */
    List<Customer> getForListWithCriteriaCustomer(CriteriaCustomer cc);

    List<Customer> getAll();

    void save(Customer customer);

    Customer get(Integer id);

    void delete(Integer id);

    void update(Customer customer);

    /**
     * 返回和 name 相等的记录数.
     * @param name
     * @return
     */
    long getCountWithName(String name);

}
