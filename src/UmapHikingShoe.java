/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class UmapHikingShoe implements IHikingShoe {

    ShoeColor color;
    ShoeType type;

    public UmapHikingShoe(ShoeType type, ShoeColor color) {
        this.color = color;
        this.type = type;
    }

    public ShoeColor getShoeColor() {

        return color;
    }

    public ShoeType getShoeType() {

        return type;
    }
}
