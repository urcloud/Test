# D - Colorful Bracket Sequence

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 400 points

## Problem Statement
You are given a string S consisting of six types of characters: (, ), [, ], <, >.

A string T is called a colorful bracket sequence if it satisfies the following condition:
> It is possible to turn T into an empty string by repeating the following operation any number of times (possibly zero):
* If there exists a contiguous substring of T that is one of (), [], or <>, choose one such substring and delete it.
* If the deleted substring was at the beginning or end of T, the remainder becomes the new T.
* Otherwise, concatenate the part before the deleted substring and the part after the deleted substring, and that becomes the new T.

Determine whether S is a colorful bracket sequence.


## Constraints
* S is a string of length between 1 and $$2×10^5$$, inclusive.
* S consists of (, ), [, ], <, >.


## Input
The input is given from Standard Input in the following format:
> S

## Output
If S is a colorful bracket sequence, print Yes; otherwise, print No.


### Sample Input 1
> ([])<>()
### Sample Output 1
> Yes

For S=([])<>(), it is possible to turn it into an empty string by repeating the operation as follows:
* Delete the substring [] from the 2nd to the 3rd character in ([])<>(), then concatenate the parts before and after it. The string becomes ()<>().
* Delete the substring () from the 1st to the 2nd character in ()<>(). The string becomes <>().
* Delete the substring <> from the 1st to the 2nd character in <>(). The string becomes ().
* Delete the substring () from the 1st to the 2nd character in (). The string becomes empty.
* Thus, S=([])<>() is a colorful bracket sequence, so print Yes.

### Sample Input 2
> ([<)]>
### Sample Output 2
> No

Since S=([<)]> does not contain (), [], or <> as a contiguous substring, we cannot perform the 1st operation, and in particular 
S is not a colorful bracket sequence. Therefore, print No.

### Sample Input 3
> ())
### Sample Output 3
> No

It is impossible to turn S into an empty string by repeating the operations.
Therefore, S is not a colorful bracket sequence, so print No.