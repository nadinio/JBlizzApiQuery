import apiclasses.Spell;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

public class ApiTest {

    @Test
    public void testBlizzApi(){
        RestTemplate template = new RestTemplate();
        Spell spell = template.getForObject("https://us.api.blizzard.com/wow/spell/17086?locale=en_US&access_token=" + ApiConstants.ACCESS_TOKEN, Spell.class);

        assertEquals("Breath", spell.getName());

    }
}
