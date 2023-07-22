package ru.vbutkov.binarysearch;

import java.util.Objects;

public class Player {
    private int rating;
    private String name;

    public Player(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int findIndex(Player[] players, Player newPlayer) {
        int left = 0;
        int rigth = players.length;

        while (left < rigth) {
            int middle = left + (rigth - left) / 2;
            if (players[middle].rating < newPlayer.rating) {
                left = middle + 1;
            } else  {
                rigth = middle;
            }

        }
        return left;
    }

    @Override
    public String toString() {
        return "Player{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return rating == player.rating && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, name);
    }
}
