package com.example.hw422;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;

public class ItemData {

    private Drawable image;
    private String title;
    private String subtitle;
    private Button btn;

    public ItemData(Drawable image, String title, String subtitle, Button btn) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.btn = btn;
    }


    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
