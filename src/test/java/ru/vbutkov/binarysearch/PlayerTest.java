package ru.vbutkov.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void findIndex() {
        Player[] players = new Player[]{
                new Player(1100, "Player1"),
                new Player(1200, "Player2"),
                new Player(1600, "Player3"),
                new Player(1600, "Player4"),
                new Player(1700, "Player5"),
        };

        Player newPlayer = new Player(1600, "Player3");
        int index = newPlayer.findIndex(players, newPlayer);

        assertEquals(index, 2);
        assertEquals(players[index], newPlayer);
    }

}