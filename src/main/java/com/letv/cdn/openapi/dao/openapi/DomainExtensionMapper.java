package com.letv.cdn.openapi.dao.openapi;

import com.letv.cdn.openapi.pojo.DomainExtension;
import com.letv.cdn.openapi.pojo.DomainExtensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainExtensionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int countByExample(DomainExtensionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int deleteByExample(DomainExtensionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int insert(DomainExtension record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int insertSelective(DomainExtension record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    List<DomainExtension> selectByExample(DomainExtensionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    DomainExtension selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int updateByExampleSelective(@Param("record") DomainExtension record, @Param("example") DomainExtensionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int updateByExample(@Param("record") DomainExtension record, @Param("example") DomainExtensionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int updateByPrimaryKeySelective(DomainExtension record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_extention
     *
     * @mbggenerated Mon May 18 16:46:02 CST 2015
     */
    int updateByPrimaryKey(DomainExtension record);
}