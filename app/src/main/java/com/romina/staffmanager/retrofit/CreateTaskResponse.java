package com.romina.staffmanager.retrofit;

import java.io.Serializable;

/**
 * Created by Abhilash on 17-07-2017
 */

public class CreateTaskResponse implements Serializable {
    private boolean success;
    private String data;

    public boolean isSuccess() {
        return success;
    }

    public String getData() {
        return data;
    }
}
