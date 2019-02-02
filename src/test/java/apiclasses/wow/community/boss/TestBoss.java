package apiclasses.wow.community.boss;


import apiclasses.ApiConstants;
import apiclasses.wow.community.boss.Boss;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

public class TestBoss {

    @Test
    public void testBoss(){
        RestTemplate template = new RestTemplate();
        Boss boss = template.getForObject(ApiConstants.BASE_REST_URL + ApiConstants.WOW_URL + "boss/24723?locale=en_US&access_token=" + ApiConstants.ACCESS_TOKEN, Boss.class);

        assertEquals("Selin Fireheart", boss.getName());

    }
}

