package com.cn.elp.util;

import com.cn.elp.POJO.Checktaskinfo;
import com.cn.elp.POJO.Flawinfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class ChecktaskCondition extends Checktaskinfo {

    private Date CreateDateMin;

    private Date CreateDateMax;
    private PageSurpport<Checktaskinfo> pageSurpport;
    private String checkByName;
    private String circuitName;
    private String createByName;
    private int pageIndex;
    private int pageSize;
    private int from;
    private List<Flawinfo> flawinfoList;
    public int getFrom() {
        return (pageIndex-1)*pageSize;
    }

    public List<Flawinfo> getFlawinfoList() {
        return flawinfoList;
    }

    public void setFlawinfoList(List<Flawinfo> flawinfoList) {
        this.flawinfoList = flawinfoList;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public ChecktaskCondition() {
    }

    public String getCheckByName() {
        return checkByName;
    }

    public void setCheckByName(String checkByName) {
        this.checkByName = checkByName;
    }

    public PageSurpport<Checktaskinfo> getPageSurpport() {
        return pageSurpport;
    }

    public void setPageSurpport(PageSurpport<Checktaskinfo> pageSurpport) {
        this.pageSurpport = pageSurpport;
    }

    public Date getCreateDateMin() {
        return CreateDateMin;
    }

    public void setCreateDateMin(Date createDateMin) {
        CreateDateMin = createDateMin;
    }

    public Date getCreateDateMax() {
        return CreateDateMax;
    }

    public void setCreateDateMax(Date createDateMax) {
        CreateDateMax = createDateMax;
    }
}
