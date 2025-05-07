# A - Triple Four

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 100 points

## Problem Statement
You are given an integer sequence of length 
$$N: A=(A_1, A_2, … ,A_N).$$

Determine whether there is a place in A where the same element appears three or more times in a row.
More formally, determine whether there exists an integer i with 1≤i≤N−2 such that 
$$A_i = A_(i+1) =A_(i+2).$$


## Constraints
* 3≤N≤100
* $$1≤A_i≤100$$
* All input values are integers.


## Input
The input is given from Standard Input in the following format:
> $$N$$
> $$A_1$$
> $$A_2$$
> $$⋮$$
> $$A_N$$
​
## Output
If there is a place in A where the same element appears three or more times in a row, print Yes. Otherwise, print No.


### Sample Input 1
>5

>1 4 4 4 2
### Sample Output 1
> Yes

We have A=(1,4,4,4,2). There is a place where 4 appears three times in a row, so print Yes.

### Sample Input 2
> 6

> 2 4 4 2 2 4
### Sample Output 2
> No

We have A=(2,4,4,2,2,4). There is no place where the same element appears three or more times in a row, so print No.

### Sample Input 3
> 8

> 1 4 2 5 7 7 7 2
### Sample Output 3
> Yes

### Sample Input 4
> 10

> 1 2 3 4 5 6 7 8 9 10
### Sample Output 4
> No

### Sample Input 5
> 13

> 1 1 1 1 1 1 1 1 1 1 1 1 1
### Sample Output 5
> Yes