package com.example.demo.mapper;

import com.example.demo.model.Problem;
import com.example.demo.model.ProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    long countByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insert(Problem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insertSelective(Problem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    List<Problem> selectByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    Problem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKeySelective(Problem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKey(Problem record);
}