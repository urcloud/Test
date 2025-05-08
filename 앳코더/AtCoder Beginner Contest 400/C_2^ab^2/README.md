# C - 2^a b^2

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 350 points

## Problem Statement
A positive integer X is called a good integer if and only if it satisfies the following condition:

* There exists a pair of positive integers (a,b) such that $$X=2^a×b^2$$.

For example, 400 is a good integer because $$400=2^2×10^2$$.
Given a positive integer N, find the number of good integers between 1 and N, inclusive.


## Constraints
* $$1≤N≤10^18 $$
* N is an integer.


## Input
The input is given from Standard Input in the following format:
> N

## Output
Print the number of good integers between 1 and 
N, inclusive.


### Sample Input 1
> 20
### Sample Output 1
> 5

There are five good integers between 1 and 
20: 2, 4, 8, 16, and 18.

Thus, print 5.

### Sample Input 2
> 400
### Sample Output 2
> 24

### Sample Input 3
> 1234567890
### Sample Output 3
> 42413

Note that the input might not fit in a 32-bit integer type.