package org.rickosborne.bigram.storage;

import org.rickosborne.bigram.util.Prediction;

public interface IBigramStorage {

    public void add(String firstWord, String secondWord);
    public Prediction get(String firstWord, String partial);

}
