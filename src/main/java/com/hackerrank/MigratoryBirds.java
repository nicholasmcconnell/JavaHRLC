package com.hackerrank;

import java.util.*;

public class MigratoryBirds {
    public static void main(String[] arg) {
        int[] birds = {1, 4, 4, 4, 5, 3};
        List<Integer> birdList = new ArrayList<Integer>();
        for (int i = 0; i<birds.length; i++){
            birdList.add(birds[i]);
        }
        Collections.sort(birdList);
        System.out.println(birdList);
//        System.out.println(migratoryBirds(birds));
        System.out.println(migratoryBirdsList(birdList));
        System.out.println(migratoryBirdsYouTube(birdList));


    }

    static int migratoryBirdsYouTube(List<Integer> arr){

        int max = 0;
        int[] countArray = new int[3 << 1];

        for(int val : arr){
            countArray[val]++;
            max = Math.max(max, countArray[val]);
        }

        for (int i = 0; i< countArray.length; i++){
            if(max == countArray[i]){
                return i;
            }
        }

        return 0;
    }

    static int migratoryBirdsList(List<Integer> birdList){
//        Collections.sort(birdList);
        System.out.println(birdList);

        int highestCount = 0;
        int highestBird = 0;

        int currentCount = 0;
        int currentBird = 0;

       for(int i = 0; i<birdList.size(); i++){
           System.out.println("i " + birdList.get(i));
           if (currentBird == 0) {
               currentCount++;
               currentBird = birdList.get(i);
               System.out.println(currentBird);
               continue;
           }

           if (birdList.get(i) == birdList.get(i-1)) {
               currentCount++;
               System.out.println("current "  + currentBird + " " + currentCount);
           }

           if (birdList.get(i) != birdList.get(i-1)) {
               if (currentCount > highestCount) {
                   highestCount = currentCount;
                   highestBird = currentBird;
                   currentBird = birdList.get(i);
                   currentCount = 1;
               } else {
                   currentBird = birdList.get(i);
                   currentCount = 1;
               }

           }
           System.out.println("highest "  + highestBird + " " + highestCount);

       };


        return highestBird;
    }

    static int migratoryBirds(int[] birds) {
        Arrays.sort(birds);

        int highestCount = 0;
        int highestBird = 0;

        int currentCount = 0;
        int currentBird = 0;

        for (int i = 0; i < birds.length; i++) {
            if (currentBird == 0) {
                currentCount++;
                currentBird = birds[i];
                continue;
            }

            if (birds[i] == birds[i - 1]) {
                currentCount++;
            }

            if (birds[i] != birds[i - 1]) {
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                    highestBird = currentBird;
                    currentBird = birds[i];
                    currentCount = 1;
                }

            }
        }
        return highestBird;
    }
}
