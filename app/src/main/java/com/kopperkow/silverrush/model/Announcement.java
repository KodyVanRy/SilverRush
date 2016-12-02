package com.kopperkow.silverrush.model;

import org.json.JSONObject;

/**
 * Created by Dakota Van Ry on 12/1/2016. Use it
 */

public class Announcement {
    private String title, details, imageUrl;

    public Announcement(String title, String details, String imageUrl) {
        this.title = title;
        this.details = details;
        this.imageUrl = imageUrl;
    }

    public Announcement buildAnnouncementFromJson(JSONObject jsonObject) {
        try {
            String _title = null, _details = null, _imageUrl = null;
            if (jsonObject.has("title") && !jsonObject.isNull("title"))
                _title = jsonObject.getString("title");
            if (jsonObject.has("details") && !jsonObject.isNull("details"))
                _details = jsonObject.getString("details");
            if (jsonObject.has("imageUrl") && !jsonObject.isNull("imageUrl"))
                _imageUrl = jsonObject.getString("imageUrl");
            return new Announcement(_title, _details, _imageUrl);
        } catch (Exception ignore) {

        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
