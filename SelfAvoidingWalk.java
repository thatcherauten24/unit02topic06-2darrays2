public class SelfAvoidingWalk {

    public static int[] walk(int n) {
        boolean[][] grid = new boolean[n][n];

        int x = n / 2;
        int y = n / 2;
        int pathLength = 0;
        while (
            x >= 0 && x < n &&
            y >= 0 && y < n &&
            grid[x][y] == false

        ) {
            grid[x][y] = true;

            double r = Math.random();
            if (r < 0.25) {
                y = y - 1;
                // up
                pathLength++;
            } else if (r < .5) {
                y = y + 1;
                // down
                pathLength++;
            } else if (r < .75) {
                x = x - 1;
                // left
                pathLength++;
            } else {
                x = x + 1;
                // right
                pathLength++;
            }

        }

        if (x < 0 || x >= n || y < 0 || y >= n) {
            return new int[] {pathLength, 0};
        } else {
            return new int[] {pathLength, 1};
        }

    }

    public static void printPathLengths(int n, int nTrials) {
        for (int trialNum = 0; trialNum < nTrials; trialNum++) {
            int[] walkResult = walk(n);

            if (walkResult[1] == 0) {
                //it escaped
            } else {
                // it hit a dead end
            }
            
        }

        double avgPathLen = totalPathLen / nTrials;
        System.out.println("The average path length is " + avgPathLen);

        
        System.out.println("The probability of hitting a dead-end is " + );
    }

    // public static double deadEndRectangle(int n, int nTrials) {

    // }

    public static void main(String[] args) {
        int dimension = 10;

        walk(dimension);
        printPathLengths(dimension, 1000000);
    }
}
