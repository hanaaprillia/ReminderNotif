package com.dicoding.picodiploma.reminderwork;

public class ModelData {

    int id;
    private final String title;
    private final String date;
    private final String time;

    ModelData(int id, String title, String date, String time) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getDate() {
        return date;
    }

    String getTime() {
        return time;
    }

}
