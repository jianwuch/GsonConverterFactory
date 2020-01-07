package com.jc.base.network;

import com.google.gson.annotations.SerializedName;

/**
 * @author : jc
 * date : 2020-01-06 17:38
 * description :
 */
public class CodeData {
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String message;
}
