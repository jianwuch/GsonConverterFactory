package com.jc.base.network;

import com.google.gson.annotations.SerializedName;

/**
 * @author : jc
 * date : 2019-09-30 17:42
 * description :附带其他完整信息的http返回数据
 */
public class RawResponseData<T> extends CodeData {
    @SerializedName("data")
    public T data;
}
