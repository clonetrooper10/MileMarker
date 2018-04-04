package com.example.jett.milemarker;

import java.util.List;

public class JSONresponse {
    List<snappedPoints> snappedPoints;
    class snappedPoints {
        Location location;
        Integer originalIndex;
        String placeId;

        @Override
        public String toString(){
            return this.location.toString();
        }
    }
    class Location {
        Float latitude;
        Float longitude;

        @Override
        public String toString() {
            return this.latitude + ", " + this.longitude;
        }
    }
}
