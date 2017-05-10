package com.example.alex.funfacts;

import java.util.Random;

public class FactBook {
    // Fields
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "In the UK, it is illegal to eat mince pies on Christmas Day!",
            "The top six foods that make your fart are beans, corn, bell peppers, cauliflower, cabbage and milk!",
            "King Henry VIII slept with a gigantic axe beside him.",
            "Movie trailers were originally shown after the movie, which is why they were called “trailers”.",
            "Cherophobia is the fear of fun." };

    // Methods
    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
