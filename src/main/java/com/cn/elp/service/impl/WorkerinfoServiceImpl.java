package com.cn.elp.service.impl;

import com.cn.elp.POJO.Workerinfo;
import com.cn.elp.dao.WorkerinfoDao;
import com.cn.elp.service.WorkerinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class WorkerinfoServiceImpl implements WorkerinfoService{
    @Resource
    WorkerinfoDao workerinfoDao;

    @Override
    public Workerinfo findAllWorker(String userNo) {
        return workerinfoDao.findAllWorker(userNo);
    }

    @Override
    public List<Workerinfo> findWorkerByRoleId(int roleId) {
        return workerinfoDao.findWorkerByRoleId(roleId);
    }

    @Override
    public List<Workerinfo> findAllWorkers() {
        return workerinfoDao.findAllWorkers();
    }

    @Override
    public List<Workerinfo> findAllWorkersPaging(String userName, String status, int pageIndex, int pageSize) {
        return workerinfoDao.findAllWorkersPaging(userName,status,(pageIndex-1)*pageSize,pageSize);
    }

    @Override
    public int findAllWorkersCount(String userName, String status) {
        return workerinfoDao.findAllWorkersCount(userName,status);
    }

    @Override
    public int updateWorkerByUserNo(Workerinfo workerinfo) {
        return workerinfoDao.updateWorkerByUserNo(workerinfo);
    }

    @Override
    public int updateWorkerLastTime(Date lastOnLine,String userNo) {
        return workerinfoDao.updateWorkerLastTime(lastOnLine,userNo);
    }

    @Override
    public int addWorker(Workerinfo workerinfo) {
        return workerinfoDao.addWorker(workerinfo);
    }

    @Override
    public int checkWorkerInfo(String userNo, String userName) {
        int rel=-1;//添加失败
        List<Workerinfo> workerinfoList = workerinfoDao.findAllWorkers();
        for(Workerinfo workers:workerinfoList){
            if(userNo!=null && userNo.equals(workers.getUserNo())){
                rel=-1;//用户编号已存在
                break;
            }else if (userName!=null && userName.equals(workers.getUserName())){
                rel=-2;//用户名称已存在
                break;
            }else{
                rel=0;
            }
        }
        return rel;
    }

    @Override
    public int modifyWorkerinfoByuserNo(Workerinfo workerinfo) {
        return workerinfoDao.modifyWorkerinfoByuserNo(workerinfo);
    }

    @Override
    public int delWorkerinfoByuserNo(String userNo) {
        return workerinfoDao.delWorkerinfoByuserNo(userNo);
    }

    @Override
    public int updateWorkerinfoStatus(String status,String userNo) {
        return workerinfoDao.updateWorkerinfoStatus(status,userNo);
    }


}
