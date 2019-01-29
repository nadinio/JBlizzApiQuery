import apiclasses.Spell;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class main {
    private static final Logger log = LoggerFactory.getLogger(main.class);

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
//        Spell spell = template.getForObject("https://us.api.blizzard.com/wow/spell/17086?locale=en_US&access_token=USNr7oQ7H5oqr7WfMMrKG7ROyygJ6axMMg", Spell.class);

        ArrayList<Spell> spells = new ArrayList<>();

        for(int i = 1; i < 1000; i++){
            try {
                Spell spell = template.getForObject("https://us.api.blizzard.com/wow/spell/" + (17000 + i) + "?locale=en_US&access_token=" + ApiConstants.ACCESS_TOKEN, Spell.class);
                spells.add(spell);
            } catch (HttpClientErrorException ex){
                log.error(ex.getStatusCode().toString());
                if(ex.getStatusCode().toString().contains("404"))
                {
                    continue;
                } else {
                    log.error(ex.toString());
                    log.error(ex.getStackTrace().toString());
                }

            }
        }


        for(Spell spell : spells){
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(spell);
            session.getTransaction().commit();
            session.close();
        }


    }
}
