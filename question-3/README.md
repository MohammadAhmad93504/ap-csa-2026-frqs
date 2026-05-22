# Question 3: ArrayList Algorithms

This question focuses on pulling specific data from an ArrayList filled with Attendance objects, which keep track of student IDs and their respective attendance records. The goal was to write a method that counts and returns how many students are enrolled in both Math (`mathList`) and History (`historyList`), but specifically have a higher number of absences in their History class compared to Math.

### My Approach
I kicked things off by initializing a counter variable to track the number of matching students. To find the students enrolled in both classes, I set up a nested loop: the outer loop iterates through `historyList`, and the inner loop scans `mathList`. Inside, I set up a conditional statement to check if the student ID from the history roster matched the ID from the math roster. 

If the IDs matched, the code then compared their absences. If the history absence count was strictly greater than the math absence count, the counter incremented by one. Once the loops finished checking everyone, the final count was returned.

### What Gave me Trouble
The main hurdle for me was figuring out the cleanest way to cross-reference the two lists to see if a student in the history class was also sitting in the math class. Luckily, the problem statement included a precondition that there were no duplicate students and no null elements, which saved me from having to write a bunch of extra edge-case filtering logic.

### What I would do Differently
If I were to rewrite this, I’d try to clean up the nested loop by cutting down on the local variables I declared inside the blocks. I created a few extra variables to hold temporary data, which made the code a bit wordy and used up unnecessary memory. Next time, I'd just consolidate those checks directly into a more compact boolean condition to keep things efficient.

### Course Connections
This problem reminded me a lot of the **Candy Box** lab we did earlier this year. In that project, we had to traverse an ArrayList to check if specific objects existed based on certain traits before we could filter or remove them.
