package com.trtc.uikit.livekit.component.barrage.service;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class BarrageJson {

    @SerializedName("data")
    public Data   data;
    @SerializedName("platform")
    public String platform;

    @SerializedName("version")
    public String version;
    @SerializedName("businessID")
    public String businessID;

    // map to Barrage
    public static class Data {
        @SerializedName("extInfo")
        private final Map<String, String> extInfo = new HashMap<>();

        @SerializedName("content")
        public String  content;

        @SerializedName("user")
        public User  user;

        public static class User {
            @SerializedName("userId")
            public String userId;
            @SerializedName("avatarUrl")
            public String avatarUrl;
            @SerializedName("userName")
            public String userName;
            @SerializedName("level")
            public String level;

            @Override
            public String toString() {
                return "User{"
                        + "userId='" + userId + '\''
                        + ", avatarUrl='" + avatarUrl + '\''
                        + ", userName='" + userName + '\''
                        + ", level='" + level + '\''
                        + '}';
            }
        }

        @Override
        public String toString() {
            return "Data{"
                    + "extInfo=" + extInfo
                    + ", content='" + content + '\''
                    + ", user=" + user
                    + '}';
        }
    }

    @Override
    public String toString() {
        return "TUIBarrageJson{"
                + "data=" + data
                + ", platform=" + platform
                + ", version=" + version
                + ", businessID=" + businessID
                + '}';
    }
}
