package dreamersnet.net.houseadventure;

import java.util.ArrayList;

/**
 * Created by water on 10/30/2016.
 */

public class Room {
    private String mName;
    private String mDesc;
    private ArrayList<Item> mItems = new ArrayList<Item>();
    private ArrayList<Player> mPlayers = new ArrayList<Player>();
    private int mResImage;

    public Room(String name, String desc, int resImage) {
        mName = name;
        mDesc = desc;
        mResImage = resImage;
    }

    public String getName() {
        return mName;
    }

    public int getResImage() {
        return mResImage;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setResImage(int resImage) {
        mResImage = resImage;
    }

    public void setItems(ArrayList<Item> items) {
        mItems = items;
    }

}
