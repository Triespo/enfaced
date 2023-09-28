package com.miguel.enfaced.model;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class ItemGallery {
    private final Bitmap picture;
    private final Bitmap pictureBB;
    private final ImageType type;
    private final List<Person> personList;

    public ItemGallery(Bitmap picture, Bitmap pictureBB, ImageType type) {
        this.picture = picture;
        this.pictureBB = pictureBB;
        this.type = type;
        personList = new ArrayList<>();
    }

    public Bitmap getPicture() {
        return picture;
    }

    public Bitmap getPictureBB() {
        return pictureBB;
    }

    public ImageType getType() {
        return type;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
