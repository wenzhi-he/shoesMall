
package com.yc.shoesMall.bean;

public class ProductSize {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_size.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer id;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_size.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_size.size
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_size.count
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_size.id
     *
     * @return the value of product_size.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_size.id
     *
     * @param id the value for product_size.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_size.pid
     *
     * @return the value of product_size.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_size.pid
     *
     * @param pid the value for product_size.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_size.size
     *
     * @return the value of product_size.size
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_size.size
     *
     * @param size the value for product_size.size
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_size.count
     *
     * @return the value of product_size.count
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_size.count
     *
     * @param count the value for product_size.count
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}