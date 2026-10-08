# 🚀 LeetCode 75 Days & Interview Journey

Welcome to my repository! This space tracks my problem-solving journey, daily coding practice, and preparation for software engineering interviews. 

Today marks a major milestone: **Day 75** of consistent coding, alongside attending a technical interview!

---

## 📌 Featured Problem: Count and Say (LeetCode 38)

Today's featured problem is a classic string manipulation challenge that tests run-length encoding (RLE).

### 💡 Problem Overview
The count-and-say sequence is a sequence of digit strings defined recursively:
* `countAndSay(1) = "1"`
* `countAndSay(n)` is the run-length encoding of `countAndSay(n - 1)`.

### 🛠️ Java Solution
```java
class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        
        while (--n > 0) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < sb.length(); ++i) {
                int count = 1;
                while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                next.append(count).append(sb.charAt(i));
            }
            sb = next;
        }
        
        return sb.toString();
    }
}
