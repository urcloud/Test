# B - Ranking with Ties

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 200 points

## Problem Statement
N people labeled from 1 to N participated in a certain contest. The score of person i (1≤i≤N) was $$P_i$$.

In this contest, the rank of each of the N people is determined by the following procedure:

1. Prepare a variable r, and initialize r=1. Initially, the ranks of the N people are all undetermined.

2. Repeat the following operation until the ranks of all N people are determined:
    * Let x be the maximum score among the people whose ranks are currently undetermined, and let k be the number of people whose score is x. Determine the rank of those k people with score x to be r, and then add k to r.

Print the rank of each of the N people.


## Constraints
* 1≤N≤100
* $$1≤P_i≤100$$
* All input values are integers.


## Input
The input is given from Standard Input in the following format:
> $$N$$
> $$P_1 P_2 … P_N$$
​
 
## Output
Print N lines. The i-th line (1≤i≤N) should contain the rank of person i as an integer.


### Sample Input 1
> 4

> 3 12 9 9

### Sample Output 1
> 4

> 1

> 2

> 2

The ranks of the N (=4) people are determined as follows:
1. Prepare a variable r and initialize r=1. At first, the ranks of all 4 people are undetermined.

2. Currently, persons 1,2,3,4 have undetermined ranks. The maximum score among them is $$P_2$$(=12). Therefore, determine the rank of person 2 to be r (=1), and then add 1 to r, making r=2.

3. Currently, persons 1,3,4 have undetermined ranks. The maximum score among them is $$P_3=P_4(=9)$$. Therefore, determine the ranks of persons 3 and 4 to be r (=2), and then add 2 to 
r, making r=4.

4. Currently, person 1 has an undetermined rank. The maximum score among them is $$P_1$$(=3). Therefore, determine the rank of person 1 to be r (=4), and then add 1 to r, making r=5.

5. The ranks of all 4 people are now determined, so the process ends.


### Sample Input 2
> 3

> 3 9 6
### Sample Output 2
> 3

> 1

> 2

### Sample Input 3
> 4

> 100 100 100 100
### Sample Output 3
> 1

> 1

> 1

> 1
### Sample Input 4
> 8

> 87 87 87 88 41 38 41 38

### Sample Output 4
> 2

> 2

> 2

> 1

> 5

> 7

> 5

> 7