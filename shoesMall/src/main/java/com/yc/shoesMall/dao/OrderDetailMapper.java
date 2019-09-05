
package com.yc.shoesMall.dao;

import com.yc.shoesMall.bean.OrderDetail;
import com.yc.shoesMall.bean.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    long countByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int deleteByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    List<OrderDetail> selectByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByPrimaryKey(OrderDetail record);
}