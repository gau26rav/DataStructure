Topics covered in the class

1. Hash Set and hash map
2. Sorting
3. Bitwise


1. https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/


2. Given a list of prices of toys and an amount to spend,
 what is the maximum number of toys Mark can buy?

 prices [] = {9, 7, 4 ,6, 2, 13, 3} and k=14
 ans = 3

 prices: an array of integers representing toy prices
 k: an integer, Mark's budget

 Algo  - sort in ascending order and pick items from starting till the entire money is spent.




3. Pick only k toys to maximize the total profit because the capacity of bag is only for k items

prices [] = {9, 7, 4 ,6, 2, 13, 3} and k=4
ans = 13+9+7+6

Algo  - sort in descending order and pick k items from starting.






4. Sorting the the data of students on the basis
 of marks obtained.

 int roll_no[] = {10, 20, 5, 40 };
    int marks[] = {30, 60, 20, 50};

before applying sort :
10 30
20 60
5 20
40 50

after applying sort:
5 20
10 30
40 50
20 60



==========

#include<bits/stdc++.h>
using namespace std;

// Driver function to sort the vector elements
// by second element of pairs
bool sortbysec(const pair<int,int> &a,
              const pair<int,int> &b)
{
    return (a.second < b.second);
}

int main()
{
    // declaring vector of pairs
    vector< pair <int, int> > vect;

    // Initialising 1st and 2nd element of pairs
    // with array values
    int roll_no[] = {10, 20, 5, 40 };
    int marks[] = {30, 60, 20, 50};
    int n = 4;

    // Entering values in vector of pairs
    for (int i=0; i<n; i++)
        vect.push_back( make_pair(roll_no[i],marks[i]) );

    // Printing the original vector(before sort())
    cout << "The vector before sort operation is:\n" ;
    for (int i=0; i<n; i++)
    {
        cout << vect[i].first << " "
             << vect[i].second << endl;

    }

    // Using sort() function to sort by 2nd element
    // of pair
    sort(vect.begin(), vect.end(), sortbysec);

    // Printing the sorted vector(after using sort())
    cout << "The vector after sort operation is:\n" ;
    for (int i=0; i<n; i++)
    {
        // "first" and "second" are used to access
        // 1st and 2nd element of pair respectively
        cout << vect[i].first << " "
             << vect[i].second << endl;
    }
    return 0;
}

===========

For java: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/


5. fractional knapsack

** https://www.geeksforgeeks.org/fractional-knapsack-problem/




6. Sort the array by frequency

Given an array of integers, sort the array according to frequency of elements.
If frequencies of two elements are same, print them in increasing order.

Examples:

Input : arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}
Output : 3 3 3 3 2 2 2 12 12 4 5
Explanation :
No. Freq
2  : 3
3  : 4
4  : 1
5  : 1
12 : 2

https://www.geeksforgeeks.org/sort-elements-by-frequency/
https://www.geeksforgeeks.org/sorting-array-elements-frequency-set-3-using-stl/





7. Distribute Candies

Given an integer array with even length,
where different numbers in this array represent
different kinds of candies. Each number means
one candy of the
corresponding kind. You need to
dis…


=== hashing ===

1. Find winner of an election where
votes are represented as candidate names

If there is tie, print lexicographically
smaller name.

Examples:

Input :  votes[] = {"john", "johnny", "jackie",
                    "johnny", "john", "jackie",
                    "jamie", "jamie", "john",
                    "johnny", "jamie", "johnny",
                    "john"};
Output : John
We have four Candidates with name as 'John',
'Johnny', 'jamie', 'jackie'. The candidates
John and Johny get maximum votes. Since John
is alphabetically smaller, we print it.

2. Design a data structure that supports insert, delete, search and getRandom in constant time
https://www.geeksforgeeks.org/design-a-data-structure-that-supports-insert-delete-search-and-getrandom-in-constant-time/





=== bitwise ===

https://www.geeksforgeeks.org/turn-off-the-rightmost-set-bit/

1. Check if a number is power of 2.

Input : n = 4
Output : Yes

Input : n = 7
Output : No

Input : n = 32
Output : Yes



* Puzzle based on Bits / Bitwise operators (normally asked in interviews) *

1. https://www.geeksforgeeks.org/puzzle-31-minimum-cut-puzzle/

2. Similar Ques: https://www.geeksforgeeks.org/puzzle-4-pay-an-employee-using-a-gold-rod-of-7-units/

3. generalized this question for n (gold bar of length n)

4. https://stackoverflow.com/questions/2589986/puzzle-find-the-minimum-number-of-weights

Similar ques and generalized for n

5. https://www.geeksforgeeks.org/weight-heavy-ball/