[2:22 PM, 1/6/2019] +91 92058 34773: The questions that I discussed today: 1. Can we convert it to a palindrome (we can change the order of characters)?

For example
abcab - true
abc - false



2. Longest Palindrome

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes
that can be built with those letters.

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.



====================
#include<bits/stdc++.h>
using namespace std;
int longestPalindrome(string s) {

        int arr[256]={0};
        int n=s.length();
        if(n==0) return 0;
        for(int i=0;i<n;i++)
        {
            arr[s[i]]++;
        }
        int count =0;
        for(int i=0;i<256;i++)
        {
            if(arr[i]%2==1)
            {
                count++;
            }
        }
        if(count ==0) return n;
        return (n-count+1);
    }
int main()
{
    string a = "abccccdd";
    std::cout << longestPalindrome(a) << '\n';
    return 0;
}




3. Find whether a duplicate string is present in an array of strings ?

- HashMap - O(n) with extra space
- Sorting - O(nlogn)
- With two loops - O(n2)



4. Given two strings, find if first string is a subsequence of second

Examples :

Input: str1 = "AXY", str2 = "ADXCPY"
Output: True (str1 is a subsequence of str2)

Input: str1 = "AXY", str2 = "YADXCP"
Output: False (str1 is not a subsequence of str2)

Input: str1 = "gksrek", str2 = "geeksforgeeks"
Output: True (str1 is a subsequence of str2)





#include<iostream>
#include<cstring>
using namespace std;

// Returns true if str1[] is a subsequence of str2[]. m is
// length of str1 and n is length of str2
bool isSubSequence(char str1[], char str2[], int m, int n)
{
    // Base Cases
    if (m == 0) return true;
    if (n == 0) return false;

    // If last characters of two strings are matching
    if (str1[m-1] == str2[n-1])
        return isSubSequence(str1, str2, m-1, n-1);

    // If last characters are not matching
    return isSubSequence(str1, str2, m, n-1);
}

// Driver program to test methods of graph class
int main()
{
    char str1[] = "gksrek";
    char str2[] = "geeksforgeeks";
    int m = strlen(str1);
    int n = strlen(str2);
    isSubSequence(str1, str2, m, n)? cout << "Yes ":
                                     cout << "No";
    return 0;
}



#include<iostream>
#include<cstring>
using namespace std;

// Returns true if str1[] is a subsequence of str2[]. m is
// length of str1 and n is length of str2
bool isSubSequence(char str1[], char str2[], int m, int n)
{
   int j = 0; // For index of str1 (or subsequence

   // Traverse str2 and str1, and compare current character
   // of str2 with first unmatched char of str1, if matched
   // then move ahead in str1
   for (int i=0; i<n&&j<m; i++)
       if (str1[j] == str2[i])
         j++;

   // If all characters of str1 were found in str2
   return (j==m);
}

// Driver program to test methods of graph class
int main()
{
    char str1[] = "gksrek";
    char str2[] = "geeksforgeeks";
    int m = strlen(str1);
    int n = strlen(str2);
    isSubSequence(str1, str2, m, n)? cout << "Yes ":
                                     cout << "No";
    return 0;
}

===

5. Largest Sum Contiguous Subarray
(Kadane’s Algorithm)

 int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

 Maximum contiguous sum is 7

https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
[2:23 PM, 1/6/2019] +91 92058 34773: https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
[2:23 PM, 1/6/2019] +91 92058 34773: == Some Basic questions on Recursion  ==

1.  sum of digits of a no.
// f(234) = 2+3+4 = 9
public int f(int n)
{
  if(n<10) return n;
  return n%10 + f(n/10);
}

2. No. of digits in a no.
// f(501287) = 6
public int f(int n)
{
  if(n<10) return 1;
  return 1 + f(n/10);
}


3. Count set bits in a no
// f(15) =4
public int f(int n)
{
  if(n<=1) return n;
  if(( n & 1)==1) return 1+f(n/2);
  return f(n/2);
}

4. Check if two strings are equal or not
//f("ab","ab",2,0) = true
public Boolean is_equal(String s1,String s2,int n,int i)
{
  if(i==n) return true;
  if(s1.charAt(i)!=s2.charAt(i)) return false;
  return is_equal(s1,s2,n,i+1);
}

5. Check if two strings are equal or not
//f("ab","ab",2) = true
public Boolean is_equal2(String s1,String s2,int n)
{
  if(n==0) return true;
  if(s1.charAt(n-1)!=s2.charAt(n-1)) return false;
  return is_equal2(s1,s2,n-1);
}

6. Count of 'a' in a string
public int f(String s,int n,int i)
{
  if(i==n) return 0;
  if(s.charAt(i)=='a') return 1+f(s,n,i+1);
  return f(s,n,i+1);
}

7. pow of a no.
// pow(3,4) = 81
int pow(int x,int n)
{
  if(n==0) return 1;
  if(n==1) return x;
  return x* pow(x,n-1);
}

8. sum of elements of an array
int sum_(int arr[],int n,int i)
{
  if(i==n) return 0;

  return arr[i]+sum_(arr,n,i+1);
}