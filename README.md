1. Write a method `printPathLengths` in `SelfAvoidingWalk.java` that takes an integer `n` defining the grid size and `nTrials`. It doesn't return anything, but calculates and print the average length of the paths as well as the dead-end probability. Keep separate the average lengths of escape paths and dead-end paths.

2. Write a method `deadEndRectangleArea` in `SelfAvoidingWalk.java` that takes `n` and `nTrials` and returns a `double` representing the average area of the smallest rectangle that encloses the dead-end paths.

3. Write a method `twoD6Probabilities` in `DiceRolls.java` that simulates many trials of throwing two six sided dice and adding the values, then determines the probability of getting each total.

    The exact probability distribution this situation is given by the following code (the value `probabilities[k]` is the probability that the dice sum to `k`)

    ```
    int[] frequencies = new int[13];
    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= 6; j++) {
            frequencies[i+j]++;
        }
    }

    double[] probabilities = new double[13];
    for (int k = 1; k <= 12; k++) {
        probabilities[k] = frequencies[k] / 36.0;
    }
    ```

     Determine how many trials you have to run in order to agree with this exact probability distribution to three decimal places. Your method should take no inputs and return nothing, but print a summary of its findings.

4. Write `makeMinesweeperBoard` in `Minesweeper.java` that takes integers `m` and `n`, and double `p` and returns a new `m`-by-`n` boolean array where each element has a `p` probability of having a bomb (represented by `true`).

5. Write `printMinesweeperBoard` in `Minesweeper.java` that takes a minesweeper board as input (a two dimensional boolean array), and prints the board using `*` for bombs and `.` for safe cells. For example,

    ```
    * * . . .
    . . . . .
    . * . . .
    ```

6. Write `makeNeighborBoard` in `Minesweeper.java` that takes a minesweeper board as input, and returns a two dimensional integer array of the same size that contains numbers representing the number of bombs touching (above, below, left, right, or diagonal) that cell. If the cell itself contains a bomb, assign a special unique value to it (e.g. -1).

7. Write `printNeighborBoard` in `Minesweeper.java` that takes a neighbor board as input, and prints the board. For example, for the board shown above, 

    ```
    * * 1 0 0
    3 3 2 0 0
    1 * 1 0 0
    ```

3. (+) Write a method `infiniteGrid` in `SelfAvoidingWalk.java` that takes no inputs and doesn't return anything, but estimates the average path length for a self avoiding walk where there is no limit on the size of the grid. It should print a summary of its findings.

4. (+) Write a method `threeDimensionalWalk` in `SelfAvoidingWalk.java` that explores the dead-end probability and average path lengths for various values of `n` when the grid is three-dimensional.

5. (+) Write a method `randomWalkers` in `SelfAvoidingWalk.java` that explores the idea of `n` walkers, all starting in the center of an `n` by `n` grid. Formulate and test a hypothesis about the number of steps taken before all cells of the grid have been visited.

