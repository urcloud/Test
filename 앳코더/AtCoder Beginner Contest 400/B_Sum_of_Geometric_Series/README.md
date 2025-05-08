# B - Sum of Geometric Series

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 200 points

## Problem Statement
You are given two positive integers N and M.

Let $$X= \sum_{i=0}^{M} N^i$$. If $$X≤10^9$$, print the value of X. If $$X>10^9$$, print inf.


## Constraints
* $$1≤N≤10^9$$
* $$1≤M≤100$$
* All input values are integers.


## Input
The input is given from Standard Input in the following format:
> N M

## Output
Print the value of X or inf as specified by the problem statement.


### Sample Input 1
> 7 3
### Sample Output 1
> 400

X=1+7+49+343=400. Since $$400≤10^9$$, print 400.

### Sample Input 2
> 1000000 2
### Sample Output 2
> inf

Since $$X=1000001000001>10^9$$, so print inf.

### Sample Input 3
> 999999999 1
### Sample Output 3
> 1000000000

### Sample Input 4
> 998244353 99
### Sample Output 4
> inf