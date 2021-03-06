package com.cn.elp.service;

import com.cn.elp.POJO.Checktaskinfo;
import com.cn.elp.POJO.Circuit;
import com.cn.elp.POJO.Flawinfo;
import com.cn.elp.util.ChecktaskCondition;
import com.cn.elp.util.FlawCheck;
import com.cn.elp.util.PageSurpport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChecktaskService {
    PageSurpport<ChecktaskCondition>SelectChecktaskByParam(ChecktaskCondition checktaskCondition);
    PageSurpport<ChecktaskCondition>SelectChecktaskByParamNot(ChecktaskCondition checktaskCondition, String work);
    ChecktaskCondition SelectChecktaskById(String jobId);
    List<Checktaskinfo> getCheckList(ChecktaskCondition checktaskCondition);

    PageSurpport SelectChecktask(FlawCheck flawCheck);

    int addChecktaskinfo(Checktaskinfo checktaskinfo);
    int updateCheck(Checktaskinfo checktaskinfo);

    List<Flawinfo> findFlawInfoBycheckJobNo(String checkJobNo);
    Checktaskinfo findLastCheck();


    /**
     * 代办列表 巡检员要看见的干的活！
     * @param userNo
     * @return
     */
    List<Checktaskinfo> findChecktaskInfoByUserNo(@Param("checkBy") String userNo);
    /**
     * 查询全部
     * @return
     */
    List<Checktaskinfo> findChecktaskInfo();
}
