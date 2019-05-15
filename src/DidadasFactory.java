/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class DidadasFactory implements IShoeFactory {

    public IShoe createShoe(ShoeType type, ShoeColor color) {
        switch (type) {
            case BOOT:
                return new DidadasBootShoe(type, color);

            case SPORT:
                return new DidadasSportShoe(type, color);

            case HIKING:
                return new DidadasHikingShoe(type, color);
        }
        return null;
    }

}
