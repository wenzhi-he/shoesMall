package com.yc.shoesMall.bean;

public class Image {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.image_path
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String imagePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.type
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.id
     *
     * @return the value of image.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.id
     *
     * @param id the value for image.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.pid
     *
     * @return the value of image.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.pid
     *
     * @param pid the value for image.pid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.image_path
     *
     * @return the value of image.image_path
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.image_path
     *
     * @param imagePath the value for image.image_path
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.type
     *
     * @return the value of image.type
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.type
     *
     * @param type the value for image.type
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}