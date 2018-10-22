package com.company;

public class HorseBarn {
    private Horse[] spaces;
    private
    public int findHorseSpace(String name){
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void consolidate(){
        int count = 0;
        for(int j = 0; j< spaces.length-1; j++){
            if(spaces[i].equals(null)){

            }else{
                newSpaces[count] = spaces[i];
                count++;
            }
        }
    }
}
