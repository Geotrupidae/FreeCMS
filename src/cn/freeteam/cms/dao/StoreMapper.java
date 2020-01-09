package cn.freeteam.cms.dao;

import cn.freeteam.cms.model.Store;
import cn.freeteam.cms.model.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int countByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int deleteByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int insert(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int insertSelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    List<Store> selectByExample(StoreExample example);
    List<Store> selectPageByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    Store selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    int updateByPrimaryKey(Store record);
}