package com.shopping.demo.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date
 */
public class ResponseUtils {
    public ResponseUtils() {
    }

    public static ResponseEntity<?> makeResponseEntity(Object data) {
        return new ResponseEntity(success(data), HttpStatus.OK);
    }

    public static Object success(Object data) {
        return new ResponseUtils.SuccessResult(data);
    }

    public static Object failure(String code, String msg) {
        return new ResponseUtils.FailureResult(code,msg);
    }

    static class FailureResult extends ResultObject {
        public FailureResult(String code, String msg) {
            super(code, msg, "");

        }
    }

    static class ResultObject {
        private String code;
        private String msg;
        private Object data;

        public ResultObject(String code, String msg, Object data) {
            this.code = code;
            this.msg = msg;
            this.data = data;
        }

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Object getData() {
            return this.data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    static class SuccessResult extends ResultObject {
        public SuccessResult(Object data) {
            super("0", "OK", data);
            if (data == null) {
                Map<String, String> msg = new HashMap();
                msg.put("msg", "OK");
                this.setData(msg);
            }

        }
    }
}
