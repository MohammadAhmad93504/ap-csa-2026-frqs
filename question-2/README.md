# Question 2: Class Design (Bottle Class)

Question 2 involved designing a custom `Bottle` class from scratch to track liquid capacity, update fluid levels, and handle automatic refills based on a specific threshold.

### My Approach
I created a `Bottle` class with two double instance variables: `capacity` and `currentAmount`. In the constructor, the bottle initializes by setting the `currentAmount` equal to its full capacity. 

The main logic happens in the `updateAmount` method, which subtracts the consumption change from the current volume. Right after updating, it checks if the fluid level has fallen below 25% of the total capacity (`capacity * 0.25`). If it drops below that mark, the bottle automatically resets back to full capacity before returning the updated amount.

### What Gave me Trouble
The code was pretty straightforward, but I had to make sure my conditional logic calculated the 25% threshold dynamically using `capacity * 0.25` rather than accidentally hardcoding a fixed number, ensuring the refill trigger works perfectly for any bottle size.

### What I would do Differently
I would definitely change the constructor parameter name from `x` to something more meaningful like `initCapacity` or `totalCapacity`. It works fine for the compiler, but using better variable names would make the class a lot cleaner and easier to read at a glance.

### Course Connections
This question tied back heavily to the **Restaurant Project** we worked on earlier this year, specifically when it came to managing object states, modifying instance variables through methods, and checking data thresholds.
