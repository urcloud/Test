# B - Full House 3

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 250 points

## Problem Statement
We have seven cards. The i-th card (i=1,…,7) has an integer $$A_i$$ written on it.
Determine whether it is possible to choose five of them so that the chosen cards form a full house.

A set of five cards is called a full house if and only if the following conditions are satisfied:
* For different integers x and y, there are three cards with x and two cards with y.


## Constraints
* $$A_i$$
is an integer between 1 and 13, inclusive.


## Input
The input is given from Standard Input in the following format:
> $$A_1 A_2 A_3 A_4 A_5 A_6 A_7$$

## Output
If a full house can be formed by choosing five cards, print Yes; otherwise, print No.


### Sample Input 1
> 1 4 1 4 2 1 3
### Sample Output 1
> Yes

For example, by choosing the cards (1,1,1,4,4), we can form a full house.

### Sample Input 2
> 11 12 13 10 13 12 11
### Sample Output 2
> No

No five cards chosen from the seven cards form a full house.

### Sample Input 3
> 7 7 7 7 7 7 7
### Sample Output 3
> No

Note that five identical cards do not form a full house.

### Sample Input 4
> 13 13 1 1 7 4 13
### Sample Output 4
> Yes