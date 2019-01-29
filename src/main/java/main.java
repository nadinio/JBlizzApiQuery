import apiclasses.Spell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class main {
    private static final Logger log = LoggerFactory.getLogger(main.class);

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        Spell spell = template.getForObject("https://us.api.blizzard.com/wow/spell/17086?locale=en_US&access_token=USNr7oQ7H5oqr7WfMMrKG7ROyygJ6axMMg", Spell.class);
        log.info(spell.toString());
    }
}
