package com.houserent.Service;

import com.houserent.domain.House;

public class HouseService {

    private House[] houses;
    private int idCounter = 0;
    private int houseNum = 0;
    public HouseService(int size) {
        this.houses = new House[size];
        houses[0] = new House(++idCounter,"srz","1515053","紫金花园",5000,"未出租");
        houseNum++;
    }

    public House[] info(){
        return houses;
    }
    public boolean add(House house){
        if (houseNum >= houses.length){
            House[] temp = new House[houseNum*2];
            for (int i = 0; i < houses.length; i++) {
                temp[i] = houses[i];
            }
            houses = temp;
            temp = null;
        }
        house.setId(++idCounter);
        houses[houseNum++] = house;
        return true;
    }

    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNum-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }

    public House search(int searchId){
        if (searchId<0){
            return null;
        }

        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == searchId){
                return houses[i];
            }
        }

        return null;
    }

}
