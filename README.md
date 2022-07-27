# FORD ROMAN NUMBER TASK


## Approach

I will document my approach incrementally

1. As I do not know how roman numerals work, I first googled the rules for roman numerals.
2. Based on the email requirements the range will be 1-3000. (excluding 0 as it is not a roman numeral)
   * Immediate first idea that comes to mind is use a hash map for efficient look up O(1)
   * Pros: efficient look up - Cons: could be inefficient memory use without some kind of re-use or pattern identified 
   * After jotting down different examples on paper, I have noticed that the place values are consistent, for example 4, 54, 544 all end with the same roman numeral IV
   * An alternative solution could be iterating through each digit and compare to the largest numeral, add it the roman numeral and subtract the value from the number and repeat
3. Reflections:
   * I could have used arrays and leveraged the indexes instead of using a map with both keys & values
   * There may be more efficient ways of doing this, however, considering the requirement to only go up to 3000, I think this solution is sufficient.
   * My csv test could be improved by having a broader range of numbers, I copied the first 100 from a website.
   * Unfortunately, I did not attempt part 2.
   








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