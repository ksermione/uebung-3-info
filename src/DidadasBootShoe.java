/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class DidadasBootShoe implements IBootShoe {

    ShoeColor color;
    ShoeType type;

    public DidadasBootShoe(ShoeType type, ShoeColor color) {
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
