package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class RestResponse {

    @SerializedName("success")
    private Boolean success;

    @SerializedName("data")
    private List<HistoryItem> data;

    public List<HistoryItem> getResult() {
        return data;
    }
    public boolean getMessages() {
        return success;
    }
}