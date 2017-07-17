package com.example.shadwo.segmentlistview;

/**
 * Created by shadwo on 7/17/2017.
 */

public class EntryItem implements Item {
    public final String title;
    public final String subtitle;

    public EntryItem(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean isSection() {
        return false;
    }
}
