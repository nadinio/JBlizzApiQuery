package apiclasses.wow.community.boss;

import apiclasses.ApiConstants;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

public class TestMasterList {
    @Test
    public void testBossMasterList(){
        RestTemplate template = new RestTemplate();
        MasterList boss = template.getForObject(ApiConstants.BASE_REST_URL + ApiConstants.WOW_URL + "boss/?locale=en_US&access_token=" + ApiConstants.ACCESS_TOKEN, MasterList.class);

        assertEquals("Baron Ashbury", boss.getBosses()[0].getName());
        assertEquals("Emperor Dagran Thaurissan", boss.getBosses()[89].getName());
        assertEquals("Ambassador Hellmaw", boss.getBosses()[191].getName());
        assertEquals("Lady Deathwhisper", boss.getBosses()[371].getName());

    }

}
