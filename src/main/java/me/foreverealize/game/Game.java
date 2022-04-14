package me.foreverealize.game;

import java.util.Timer;

public class Game {
    double secsPerUpdate = 1.0d / 30.0d;
    double previous = System.currentTimeMillis();
    double steps = 0.0;

    public void main(String[] args) throws Exception {
        while (true) {
            double loopStartTime = timer.;
            double elapsed = loopStartTime - previous;
            previous = current;
            steps += elapsed;

            handleInput();

            while (steps >= secsPerUpdate) {
                updateGameState();
                steps -= secsPerUpdate;
            }

            render();
            sync(current);
        }
    }

    private void sync(double loopStartTime) {
        float loopSlot = 1f / 50;
        double endTime = loopStartTime + loopSlot;
        while(System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ie) {}
        }
    }
}