package ru.vbutkov.list.hashmap;


import java.util.Arrays;
import java.util.Objects;

public class HashMap {
    private KeyValuePair[] entries = new KeyValuePair[8];
    private int size = 8;
    private int numberOfElements = 0;

    private int getHash(String key) {
        return key.hashCode();
    }

    public void put(String key, String value) {
        int index = findIndexProbing(key);
        entries[index] = new KeyValuePair(key, value);
        numberOfElements++;
        if (numberOfElements >= size) {
            resize(size * 2);
        }
    }

    private void resize(int newSize) {
        KeyValuePair newEntries[] = new KeyValuePair[newSize];
        size = newSize;
        for (int i = 0; i < entries.length; i++) {
            KeyValuePair entry = entries[i];
            if (entry == null) newEntries[i] = null;
            else {
                int index = findIndexProbing(entry.key);
                newEntries[index] = entry;
            }
        }
        entries = newEntries;
    }

    public String get(String key) {
        int index = findIndexProbing(key);
        if (index == -1) return null;
        KeyValuePair entry = entries[index];
        if (entry == null) {
            return null;
        }

        return entry.value;
    }

    private int findIndexProbing(String key) {
        int hash = getHash(key);
        int index = hash % size;
        for (int i = 0; i < entries.length; i++) {
            int probingIndex = (index + i) % size;
            KeyValuePair entry = entries[probingIndex];
            if (entry == null || entry.key.equals(key)) {
                return probingIndex;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "entries=" + Arrays.toString(entries) +
                '}';
    }

    class KeyValuePair {
        private String key;
        private String value;

        public KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KeyValuePair that = (KeyValuePair) o;

            return Objects.equals(key, that.key) && Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return "KeyValuePair{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
