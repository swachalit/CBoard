package org.cboard.dto;

import java.io.Serializable;

/**
 * Created by yfyuan on 2016/8/26.
 */
public class DataProviderResult implements Serializable{

    private String[][] data;
    private String msg;
    private int resultCount = 0;

    public DataProviderResult(String[][] data, String msg) {
        this.data = data;
        this.msg = msg;
    }

    public DataProviderResult(String[][] data, String msg, int resultCount) {
        this.data = data;
        this.msg = msg;
        this.resultCount = resultCount;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }
}
