package dreamersnet.net.houseadventure;

import java.util.ArrayList;

/**
 * Created by water on 10/30/2016.
 */

public class Player {
    private String mName;
    private String mDesc;
    private ArrayList<Item> mItems = new ArrayList<Item>();

    Player(String name) {
        mName = name;
        mDesc = "No description provided" ;
    }

    Player(String name, String desc) {
        mName = name;
        mDesc = desc;
    }

    public String getDesc() {
        return mDesc;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }
}
