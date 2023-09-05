package learnjava.comparableinterface.kclosestpoints;

import java.util.*;

public class ClosestPoints implements Comparable<ClosestPoints> {
    private int[] point;
    private Double distance;
    
    ClosestPoints(int[] point, Double distance) {
        this.point = point;
        this.distance = distance;
    }
    
    @Override
    public int compareTo(ClosestPoints nextPointDistance) {
        if (this.distance > nextPointDistance.distance) {
            return 1;
        }
        else if (this.distance == nextPointDistance.distance) {
            return 0;
        } 
        return -1;
    }
    
    public int[] getPoint() {
        return this.point;
    }
    
    public Double getDistance() {
        return this.distance;
    }
}