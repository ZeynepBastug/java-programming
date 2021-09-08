package Repl;

import java.util.*;

public class sinav {
    int timeLeft = 0;
    int maxTime;

    public sinav(Integer maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(Integer add){
        if(add == 25 && (timeLeft + 30) <= maxTime){
            timeLeft += 30;
            return true;
        }else {
            return false;
        }

    }

    public void tick(){
        if (timeLeft > 0){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if(timeLeft == 0){
            return true;
        } else {
            return false;
        }
    }
}