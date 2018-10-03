package com.vaenow.appupdate.android;

/**
 * Created by LuoWen on 2015/12/14.
 */
public class Version {
    private String local;
    private String remote;

    public Version(String local, String remote) {
        this.local = local;
        this.remote = remote;
    }

    public String getLocal() {
        return local;
    }

    public String getRemote() {
        return remote;
    }
}