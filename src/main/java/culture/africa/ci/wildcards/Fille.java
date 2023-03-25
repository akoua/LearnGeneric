package culture.africa.ci.wildcards;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Fille extends Mere {

    public void add(List<? super Fille> liste) {
        liste.add(new Fille());
        liste.add(new PetiteFille());
        log.info("val " + liste);
    }
}
