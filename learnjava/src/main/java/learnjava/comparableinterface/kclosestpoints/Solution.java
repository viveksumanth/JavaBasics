package learnjava.comparableinterface.kclosestpoints;

import java.util.*;

class Solution {
    public int[][] kClosest(final int[][] points, final int k) {

        final List<ClosestPoints> distancePoints = new ArrayList<>();
        for (int[] eachPoint: points) {
            final Integer xi = eachPoint[0];
            final Integer yi = eachPoint[1];
            final Double distance = Math.sqrt((xi*xi) + (yi*yi));
            distancePoints.add(new ClosestPoints(eachPoint, distance));
        }
        Collections.sort(distancePoints);
        
        final int[][] allPoints = new int[distancePoints.size()][];7
        int rowIndex = 0;

        for (ClosestPoints point : distancePoints) {
            final int[] dataPoint = point.getPoint();
            allPoints[rowIndex] = new int[dataPoint.length];

            for (int i = 0; i < dataPoint.length; i++) {
                allPoints[rowIndex][i] = dataPoint[i];
            }

            rowIndex++;
        }
        final int[][] result = Arrays.copyOfRange(allPoints, 0, k);
        return result;
    }
    
}
