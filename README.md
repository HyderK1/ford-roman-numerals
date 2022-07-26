# FORD ROMAN NUMBER TASK


## Approach

I will document my approach incrementally

1. As I do not know how roman numerals work, I first googled the rules for roman numerals.
2. Based on the email requirements the range will be 1-3000. (excluding 0 as it is not a roman numeral)
   1. 
       * Immediate first idea that comes to mind is use a hash map for efficient look up O(1)
       * Pros: efficient look up - Cons: could be inefficient memory use without some kind of re-use or pattern identified 
       * After jotting down different examples on paper, I have noticed that the place values are consistent, for example 4, 54, 544 all end with the same roman numeral IV
       * An alternative soloution could be iterating through each digit and compare to the largest numeral, add it the roman numeral and subtract the value from the number and repeat  








# Roman Number Rules

I used the following this resource, as well as a few others to familiarise myself with roman numerals:
https://www.britannica.com/topic/Roman-numeral

| Character | Roman Numeral |
|-----------|---------------|
| I         | 1             |
| V         | 5             |
| X         | 10            |
| L         | 50            |
| C         | 100           |
| D         | 500           |
| M         | 1000          |