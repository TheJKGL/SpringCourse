package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    public void setMusic(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.print("Playing:");
        for(Music m:musicList){
            System.out.print(" " + m.getSong());
        }
        System.out.println();
    }
}
