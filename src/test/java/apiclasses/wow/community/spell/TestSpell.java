package apiclasses.wow.community.spell;

import apiclasses.ApiConstants;
import apiclasses.wow.community.spell.Spell;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

public class TestSpell {

    @Test
    public void testSpell(){
        RestTemplate template = new RestTemplate();
        Spell spell = template.getForObject(ApiConstants.BASE_REST_URL + ApiConstants.WOW_URL + "spell/17086?locale=en_US&access_token=" + ApiConstants.ACCESS_TOKEN, Spell.class);

        assertEquals("Breath", spell.getName());

    }
}
