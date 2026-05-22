# Question 4: 2D Arrays

This question centers around a `Space` class that manages a 2D grid array representing a board. Each tile object on the board contains specific value and color properties. The goal was to write a method that calculates and returns the total points of a specific `targetRow` passed as a parameter. Additionally, if every single tile in that row shares the exact same color, the final point value of that row gets doubled.

### My Approach
Since the problem only requires analyzing one specific row, I didn't need a full nested loop to look at the entire grid—I just needed a single loop to iterate through all the columns in that specific `targetRow`. 

Before starting the loop, I initialized a cumulative sum variable to 0 and a boolean flag to `true` to keep track of the color uniformity. As the loop iterated through the row's columns, it added up the point values of each tile. To check the color consistency, I compared the color of the current tile to the color of the very first tile in that row. If even one tile didn't match the first one, the boolean flag flipped to `false`. After checking every column, the code runs a quick final check: if the flag is still `true`, the total sum is multiplied by 2, and then the final score is returned.

### What Gave me Trouble
The main thing I had to think through was how to write a foolproof check to ensure every single tile in the row shared the same color. I spent a minute deciding on the best baseline for comparison before realizing that comparing every subsequent tile back to the very first element in the row (`[targetRow][0]`) was the cleanest way to detect any color breaks.

### What I would do Differently
If I were to tackle this again, I might try a different strategy for tracking the color match. Instead of flipping a boolean flag, I could use an integer counter that increments every time a tile's color matches the first tile. At the end of the loop, if that counter equals the total length of the row, it means they were all identical. It achieves the exact same result but structures the logic a bit differently.

### Course Connections
This project felt directly connected to our **Parking Lot Project** from earlier in the year. In that lab, we had to practice traversing a 2D grid array in multiple different directions, and understanding how to isolate and sweep through a single row or column was exactly what made this exam question manageable.
