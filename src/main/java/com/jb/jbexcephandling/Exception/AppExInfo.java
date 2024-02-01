package com.jb.jbexcephandling.Exception;

import java.time.LocalDateTime;

public class AppExInfo {
    public String exCode;
    public String exMsg;
    public LocalDateTime exDate;

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode;
    }

    public String getExMsg() {
        return exMsg;
    }

    public void setExMsg(String exMsg) {
        this.exMsg = exMsg;
    }

    public LocalDateTime getExDate() {
        return exDate;
    }

    public void setExDate(LocalDateTime exDate) {
        this.exDate = exDate;
    }
}
