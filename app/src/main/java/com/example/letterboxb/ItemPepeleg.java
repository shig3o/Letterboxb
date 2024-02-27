package com.example.letterboxb;
public class ItemPepeleg {

    String name;
    String absen;
    int image;

    public ItemPepeleg(String name, String absen, int image) {
        this.name = name;
        this.absen = "Absen: " + absen;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
