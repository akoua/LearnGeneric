package culture.africa.ci.wildcards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WildcardUnderUnboundTest {

    Fille fille;

    @BeforeEach
    void setUp() {
        fille = new Fille();
    }

    @Test
    void AssignObjectTypeValue() {
        //given
        List<Object> objects = new ArrayList<>();
        //when
        fille.add(objects);
        //then
        assertEquals(2, objects.size());
    }

    @Test
    void AssignMotherTypeValue() {
        //given
        List<Mere> mothers = new ArrayList<>();
        //when
        fille.add(mothers);
        //then
        assertEquals(2, mothers.size());
    }

    @Test
    void WildcardRelation() {
        //given
        List<? super Fille> filleSub = new ArrayList<>();
        List<? super Mere> mereSub = new ArrayList<>();
        mereSub.add(new PetiteFille());
        mereSub.add(new Mere());
        //when
        filleSub = mereSub;
        //then
        assertEquals(2, filleSub.size());
    }
}