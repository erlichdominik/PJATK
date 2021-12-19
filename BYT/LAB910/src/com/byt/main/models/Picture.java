package com.byt.main.models;

import java.util.Arrays;
import java.util.Objects;

public class Picture {
    private byte[] image;
    private Long size;

    public Picture(byte[] image, Long size) {
        this.image = image;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Picture)) return false;
        Picture picture = (Picture) o;
        return Arrays.equals(getImage(), picture.getImage()) && getSize().equals(picture.getSize());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSize());
        result = 31 * result + Arrays.hashCode(getImage());
        return result;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
