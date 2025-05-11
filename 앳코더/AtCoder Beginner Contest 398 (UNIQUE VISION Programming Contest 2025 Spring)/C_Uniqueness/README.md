# C - Uniqueness

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 300 points

## Problem Statement
There are N people, labeled 1 to N. Person i has an integer $$A_i$$.

Among the people who satisfy the condition "None of the other N−1 people has the same integer as themselves," find the one with the greatest integer, and print that person's label.

If no person satisfies the condition, report that fact instead.


## Constraints
* $$1≤N≤3×10^5$$
* $$1≤A_i≤10^9$$
* All input values are integers.


## Input
The input is given from Standard Input in the following format:
> $$N$$
> $$A_1 A_2 … A_N$$
​

## Output
If no person satisfies the condition "None of the other 
N−1 people has the same integer as themselves," print -1.

Otherwise, among those who satisfy it, print the label of the person whose integer is the largest.


### Sample Input 1
> 9

> 2 9 9 7 9 2 4 5 8
### Sample Output 1
> 9

Those who satisfy the condition are the persons labeled 4, 7, 8, and 9.
Their integers are 7, 4, 5, and 8, respectively, and the person with the largest integer is the person labeled 9.
Thus, the answer is 9.

### Sample Input 2
> 4

> 1000000000 1000000000 998244353 998244353
### Sample Output 2
> -1

If no person satisfies the condition, print -1.