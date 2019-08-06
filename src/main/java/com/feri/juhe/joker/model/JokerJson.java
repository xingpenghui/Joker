package com.feri.juhe.joker.model;/**
 * @author Feri
 */

import com.feri.juhe.joker.entity.Joker;

import java.util.List;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 16:38
 */
public class JokerJson {


    /**
     * reason : Success
     * result : {"data":[{"content":"&nbsp; &nbsp; 小区门口修车师傅生意特好。人实在,只要不换零件，常常不收钱或只收个块把钱辛苦钱。最近发现他心黑了，价钱明显上调,就连充个气也收1块钱。旁边书报亭大妈是知情人，: 唉，多担待一下吧！他家上个月二胎,一窝生了四个带把的。。。。","hashId":"2e010657b420dcee335c870bf9a18301","unixtime":1559789702,"updatetime":"2019-06-06 10:55:02"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private List<Joker> data;

        public List<Joker> getData() {
            return data;
        }

        public void setData(List<Joker> data) {
            this.data = data;
        }
    }
}
