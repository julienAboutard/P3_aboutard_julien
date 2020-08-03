package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class NeighbourTest {

    @Test
    public void Neighbour_get_set_Test() {
        Neighbour neighbour = new Neighbour(1, "Caroline",
                "https://i.pravatar.cc/150?u=a042581f4e29026704d",
                "Saint-Pierre-du-Mont ; 5km",
                "+33 6 86 57 90 14",
                "www.facebook.com/Caroline",
                "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, " +
                        "je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                true);

        assertEquals(1, neighbour.getId());
        assertEquals("Caroline", neighbour.getName());
        assertEquals("https://i.pravatar.cc/150?u=a042581f4e29026704d", neighbour.getAvatarUrl());
        assertEquals("Saint-Pierre-du-Mont ; 5km", neighbour.getAddress());
        assertEquals("+33 6 86 57 90 14", neighbour.getPhoneNumber());
        assertEquals("www.facebook.com/Caroline", neighbour.getSocialNetworks());
        assertEquals("Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, " +
                "je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", neighbour.getAboutMe());
        assertTrue(neighbour.isFavorite());

        neighbour.setId(2);
        neighbour.setName("Jack");
        neighbour.setAvatarUrl("https://i.pravatar.cc/150?u=a042581f4e29026704e");
        neighbour.setAddress("Fort-De-France ; 10km");
        neighbour.setPhoneNumber("+33 0 00 00 00 00");
        neighbour.setSocialNetworks("www.facebook.com/Jack");
        neighbour.setAboutMe("Ouais j'ai réduit la taille");
        neighbour.setFavorite(false);
        assertEquals(2, neighbour.getId());
        assertEquals("Jack", neighbour.getName());
        assertEquals("https://i.pravatar.cc/150?u=a042581f4e29026704e", neighbour.getAvatarUrl());
        assertEquals("Fort-De-France ; 10km", neighbour.getAddress());
        assertEquals("+33 0 00 00 00 00", neighbour.getPhoneNumber());
        assertEquals("www.facebook.com/Jack", neighbour.getSocialNetworks());
        assertEquals("Ouais j'ai réduit la taille", neighbour.getAboutMe());
        assertFalse(neighbour.isFavorite());

    }
}
