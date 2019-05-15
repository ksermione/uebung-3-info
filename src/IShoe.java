/**
 * Created by oksana.shcherban on 15.05.19.
 */
public interface IShoe {

    public ShoeColor getShoeColor();
    public ShoeType getShoeType();
}

enum ShoeColor {
    GREEN,
    RED,
    BLUE
}

enum ShoeType {
    SPORT,
    HIKING,
    BOOT
}