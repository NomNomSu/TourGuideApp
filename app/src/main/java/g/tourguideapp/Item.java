package g.tourguideapp;

public class Item {

    private String description;
    private int mImageResourceId;

    public Item(String iDecsritpion, int imageResourceId) {
        description = iDecsritpion;
        mImageResourceId = imageResourceId;
    }

    public String getDescritpion() {
        return description;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
