/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class UmapFactory implements IShoeFactory {

    public IShoe createShoe(ShoeType type, ShoeColor color) {
        switch (type) {
            case BOOT:
                return new UmapBootShoe(type, color);

            case SPORT:
                return new UmapSportShoe(type, color);

            case HIKING:
                return new UmapHikingShoe(type, color);
        }
        return null;
    }
}
