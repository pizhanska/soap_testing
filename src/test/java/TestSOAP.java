import client.GlobalWeather;
import client.GlobalWeatherSoap;
import com.medicare.client.MediCareSupplier;
import com.medicare.client.MediCareSupplierSoap;
import com.medicare.data.DataProvd;
import org.apache.log4j.Logger;
import org.omg.Messaging.SyncScopeHelper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Uliana Pizhanska on 14/05/2017.
 */

public class TestSOAP {
    private MediCareSupplierSoap mediCareSupplierSoap;
    private MediCareSupplier mediCareSupplier;
    private Logger log = Logger.getLogger("SC: ");

    @BeforeClass
    public void setUp(){
        mediCareSupplier = new MediCareSupplier();
        mediCareSupplierSoap = mediCareSupplier.getMediCareSupplierSoap();
    }

    @Test(description = "1.Get all posts \n"
            + "2.Get post by id \n"
            + "3.Get post by user id",dataProviderClass = DataProvd.class, dataProvider = "getPosts")
    public void getSupplierByCity(){
        String s = mediCareSupplierSoap.getSupplierByCity();
        System.out.println(s);
    }

    @Test
    public void getSupplierBySupplyType(){
        String s = mediCareSupplierSoap.getSupplierBySupplyType();
        System.out.println(s);
    }

    @Test
    public void getSupplierZipCode(){
        String s = mediCareSupplierSoap.getSupplierByZipCode();
        System.out.println(s);
    }
}
