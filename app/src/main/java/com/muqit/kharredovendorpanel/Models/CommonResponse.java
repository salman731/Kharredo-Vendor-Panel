package com.muqit.kharredovendorpanel.Models;

import com.google.gson.annotations.SerializedName;

public class CommonResponse {
    @SerializedName("message")
    private String Message;
    @SerializedName("status")
    private String Status;

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String str) {
        this.Message = str;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String str) {
        this.Status = str;
    }
}
