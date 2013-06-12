import com.length.Centimeter;
import com.length.Meter;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main(String[] args) {
        Meter meter = new Meter(6);
        Centimeter centimeter = new Centimeter(6);

        System.out.println(meter.toString());
        System.out.println(centimeter.toString());
    }
}
