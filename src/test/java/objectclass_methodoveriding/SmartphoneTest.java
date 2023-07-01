package objectclass_methodoveriding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    public void smartphoneTest() {
        var smartPPrice1 = new SmartphonePrice("producer", 25460);
        var smartPPrice2 = new SmartphonePrice("producer", 2646);
        var smartPPrice3 = new SmartphonePrice("retail", 25440);
        var smartPPrice4 = new SmartphonePrice("retail", 2548);

        var smartPhone = new Smartphone("samsung", "s23", 5000, smartPPrice1, smartPPrice3);
        var smartPhone1 = new Smartphone("huawei", "y9", 4500, smartPPrice2, smartPPrice4);

        System.out.println(smartPhone);
        System.out.println(smartPhone1);

        assertNotEquals(smartPhone1, smartPhone);

        try{
            var clonedSmartphone = smartPhone1.clone();
            System.out.println(clonedSmartphone);

            Assertions.assertEquals(clonedSmartphone, smartPhone1);
        }
        catch (CloneNotSupportedException exception){
            exception.printStackTrace();
            Logger.getAnonymousLogger().severe("exception occurred");
        }
    }

}