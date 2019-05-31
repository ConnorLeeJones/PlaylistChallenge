package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;


public class Music {

    private String[] playList;
    private int minClicks;
    ArrayList<Integer> targets = new ArrayList<Integer>();


    public Music(String[] playList){
        this.playList = playList;
    }


    public Integer selection(Integer startIndex, String selection){

        minClicks = Arrays.asList(playList).indexOf(selection) - startIndex;

        for(int i = 0; i < playList.length; i++){
            if (playList[i].equals(selection)){
                targets.add(i);
            }
        }


        for (Integer target : targets){
            if ((playList.length - target + startIndex) < minClicks){
                minClicks = playList.length - target + startIndex;
            }
        }

        return minClicks;
    }
}
