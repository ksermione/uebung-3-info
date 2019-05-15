/**
 * Created by oksana.shcherban on 15.05.19.
 */
public class Main {

    public static void main(String[] args) {

        Client client = new Client();

        DidadasFactory didadasFactory = new DidadasFactory();
        UmapFactory umapFactory = new UmapFactory();

        client.setFactory(didadasFactory);

        IShoe didadasSportShoe = client.factory.createShoe(ShoeType.SPORT, ShoeColor.BLUE);
        IShoe didasBootShoe = client.factory.createShoe(ShoeType.BOOT, ShoeColor.BLUE);

        client.setFactory(umapFactory);

        IShoe umapSportShoe = client.factory.createShoe(ShoeType.SPORT, ShoeColor.BLUE);
        IShoe umapBootShoe = client.factory.createShoe(ShoeType.BOOT, ShoeColor.BLUE);


        //System.out.print("Shoe has color: " + sportShoe.getShoeColor() + " and type: " + sportShoe.getShoeType());

    }

}
