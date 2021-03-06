package com.cn.elp.service.impl;

import com.cn.elp.POJO.Towerinfo;
import com.cn.elp.dao.TowerinfoDao;
import com.cn.elp.service.TowerinfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TowerinfoServiceImpl implements TowerinfoService
{
    @Resource
    TowerinfoDao towerinfoDao;
    @Override
    public List<Towerinfo> findAllTower() {
        return towerinfoDao.findAllTower();
    }
//添加一条塔杆信息
    @Override
    public int addOneTower(Towerinfo towerinfo) {
        int rel=towerinfoDao.addOneTower(towerinfo);
        return rel;
    }

    //修改一条塔杆信息
    @Override
    public int updateTower(Towerinfo towerinfo) {
        return towerinfoDao.updateTower(towerinfo);
    }
//根据塔杆编号查询一条
    @Override
    public boolean findOneTower(String towerNo) {
        Towerinfo towerinfo=towerinfoDao.findOneTower(towerNo);
        if (towerinfo!=null){
            return true;
        }else {
            return false;
        }
    }
    //根据塔杆编号删除一条
    @Override
    public int delOneTower(String towerNo) {
        return towerinfoDao.delOneTower(towerNo);
    }

    @Override
    public List<Towerinfo> findAllTowerPage(String circuitNo, String status, int pageIndex, int pageSize) {
        int from=(pageIndex-1)*pageSize;
        return towerinfoDao.findAllTowerPage(circuitNo,status,from,pageSize);
    }

    @Override
    public int findAllTowerPageCount(String circuitNo, String status) {
        return towerinfoDao.findAllTowerPageCount(circuitNo,status);
    }

    @Override
    public int updateOneStatus(String circuitNo,String useStatus) {
        return towerinfoDao.updateOneStatus(circuitNo,useStatus);
    }

    @Override
    public int delAllTower(String circuitNo) {
        return towerinfoDao.delAllTower(circuitNo);
    }


    public List<Towerinfo> findTowerListByCircuitNoPaging( String circuitNo, int pageIndex, int pageSize){
        int from=(pageIndex-1)*pageSize;
        return towerinfoDao.findTowerListByCircuitNoPaging(circuitNo,from,pageSize);
    };
    public int findTowerListByCircuitNoPagingCount(String circuitNo){
        return towerinfoDao.findTowerListByCircuitNoPagingCount(circuitNo);
    };
}
