/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class DidadasHikingShoe implements IHikingShoe {

    ShoeColor color;
    ShoeType type;

    public DidadasHikingShoe(ShoeType type, ShoeColor color) {
        this.type = type;
        this.color = color;
    }

    public ShoeColor getShoeColor() {
        return color;
    }

    public ShoeType getShoeType() {
        return type;
    }
}
