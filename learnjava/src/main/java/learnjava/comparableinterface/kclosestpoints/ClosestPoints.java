package learnjava.comparableinterface.kclosestpoints;
public class ClosestPoints implements Comparable<ClosestPoints> {
    private int[] point;
    private Double distance;
    
    ClosestPoints(final int[] point, final Double distance) {
        this.point = point;
        this.distance = distance;
    }
    
    @Override
    public int compareTo(final ClosestPoints nextPointDistance) {
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