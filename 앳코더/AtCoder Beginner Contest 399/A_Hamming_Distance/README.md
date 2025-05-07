# A - Hamming Distance

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 100 points

## Problem Statement
You are given a positive integer N and two strings S and T, each of length N and consisting of lowercase English letters.

Find the Hamming distance between S and T. That is, find the number of integers i such that 1≤i≤N and the i-th character of S is different from the i-th character of T.


## Constraints
* 1≤N≤100
* N is an integer.
* Each of S and T is a string of length N consisting of lowercase English letters.


## Input
The input is given from Standard Input in the
following format:
> N

> S

> T

## Output
Print the answer.


### Sample Input 1
> 6

> abcarc

> agcahc
### Sample Output 1
> 2

S and T differ in the 2nd and 5th characters, but not in other characters. Thus, the answer is 2.

### Sample Input 2
> 7

> atcoder

> contest
### Sample Output 2
> 7

### Sample Input 3
> 8

> chokudai

>chokudai
### Sample Output 3
> 0
### Sample Input 4
> 10

> vexknuampx

> vzxikuamlx
### Sample Output 4
> 4