package com.itheima.ssm.service.impl;



import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll() throws Exception{
        List<Orders> orders = ordersDao.findAll();

        System.out.println(orders);
        return orders;
    }

    @Override
    public Orders findById(String id) throws Exception {
        ordersDao.findById(id);
        return null;
    }

}
