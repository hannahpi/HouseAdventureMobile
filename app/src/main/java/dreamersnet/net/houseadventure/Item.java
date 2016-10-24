package dreamersnet.net.houseadventure;

import java.util.UUID;

/**
 * Created by water on 10/24/2016.
 */

public class Item {
    private UUID mId;
    private String mName;

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Item() {
        this.mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }
}
