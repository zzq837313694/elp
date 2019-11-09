package com.cn.elp.service.impl;

import com.cn.elp.POJO.Flawinfo;
import com.cn.elp.dao.FlawinfoDao;
import com.cn.elp.service.FlawinfoService;
import com.cn.elp.util.FlawInfoCondition;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlawinfoServiceImpl implements FlawinfoService {
    @Resource
    FlawinfoDao flawinfoDao;
    @Override
    public List<Flawinfo> findAllFlawInfo(FlawInfoCondition flawInfoCondition, int pageIndex, int pageSize) {
        return flawinfoDao.findAllFlawInfo(flawInfoCondition,(pageIndex-1)*pageSize,pageSize);
    }

    @Override
    public int findAllFlawInfoCount(FlawInfoCondition flawInfoCondition) {
        return flawinfoDao.findAllFlawInfoCount(flawInfoCondition);
    }

    @Override
    public int updateFlawLvByFlawNo(String flawNo, String flawLv) {
        return flawinfoDao.updateFlawLvByFlawNo(flawNo,flawLv);
    }

    @Override
    public Flawinfo findFlawInfoByFlawNo(String flawNo) {
        return flawinfoDao.findFlawInfoByFlawNo(flawNo);
    }

}