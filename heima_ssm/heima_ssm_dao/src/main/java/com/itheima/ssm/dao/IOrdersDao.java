package com.itheima.ssm.dao;


import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOrdersDao {
    @Select("select * from orders")
    @Results(id = "orders",
            value = {
                    @Result(id=true,property = "id",column = "id"),
                    @Result(column = "orderNum",property = "orderNum"),
                    @Result(column = "orderTime",property = "orderTime"),
                    @Result(column = "orderStatus",property = "orderStatus"),
                    @Result(column = "peopleCount",property = "peopleCount"),
                    @Result(column = "payType",property = "payType"),
                    @Result(column = "orderDesc",property = "orderDesc"),
                    @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.itheima.ssm.dao.IProductDao.findById")),
            })
    List<Orders> findAll() throws Exception;

    //根据id查询产品
    @Select("select * from orders where id=#{id}")
     Orders findById(String id) throws Exception;

}
