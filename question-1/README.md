# Question 1: Methods and Control Structures

Question 1 is all about creating algorithms for usernames. Part A checks if a username is available, and Part B removes any hyphens along with the letter right before them.

## Part A

### My Approach
For this part, the goal was to see if a username is already taken by using the `isAvailable()` boolean helper method. I used it to check the name, and if it was free, the code created the Account object. If it wasn't available, I set up a while loop to keep appending numbers (starting from 1) until it finally found an open slot, and then assigned that version to the user.

### What Gave me Trouble
At first, figuring out how to add the numbers onto the string dynamically was confusing. Once I realized the logic needed to clear out the old number before adding the next one rather than just stacking them, it clicked and I was able to finish it.

### What I would do Differently
I’d probably go back and simplify the boolean expression inside the while loop. It got a little messy and convoluted, which makes it kind of hard to read.

---

## Part B

### My Approach
Part B requires returning a String that strips out all hyphens and the character directly preceding them. My code uses a while loop that keeps running as long as `indexOf("-")` doesn't equal -1. Every time it finds a hyphen, it uses `substring()` to slice out both the hyphen and the letter before it, looping until the word is clean.

### What Gave me Trouble
The logic itself was pretty straightforward, but I did stumble a bit on getting the exact indices right for the `substring()` method without accidentally throwing out-of-bounds errors. 

### What I would do Differently
I would definitely rename some of the variables to be more descriptive and throw in a few comments so the boundary logic makes more sense at a glance.

## Course Connections
Both parts felt really similar to what we did in the Restaurant project earlier this year, since both dealt heavily with string manipulation and parsing data.
