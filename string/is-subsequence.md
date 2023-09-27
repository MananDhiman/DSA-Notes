Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

# Algo
## Base Cases
// if substring start and end are same
// len of s is 1
// if s.len == 0 true
// is t.len < s.len || t.len == 0 false
## Algo
get first element s1 of s, check if s1 exists in t | if false, return false

get second element s2 of s, check if s2 exists in t where indexOf(s2) > indexOf(s1)

keep repeating for all elements of s

# Code
```java
class Solution {
  public boolean isSubsequence(String s, String t) {
    if(s.length() == 0) return true;
    if(t.length() == 0 || t.length() < s.length()) return false;

    if(s.length() == 1) {
      if(t.indexOf(s.charAt(0)) != -1) return true;
      return false;
    }

    boolean isSubseq = false;
    char s1 = s.charAt(0);
    int s1Index = t.indexOf(s1);

    if(s1Index != -1 && isSubsequence(s.substring(1), t.substring(s1Index+1))) return true;
    return false;

  }
}

```
