---
title: "Java Programming 101"
subtitle: "Project: Gibrish"
---

---

# Problem Statement

Unfortunate events have occurred during the last few days, and the new intern at IT department managed to leave a
backdoor open. The hackers have taken advantage of this situation and have managed to infiltrate the system. The hackers
have left a message in the system, but it is gibirish and the IT department needs your help to decrypt it. The message
left by the hackers can contain any characters, including but not limited to spaces, numbers, and special characters,
but it includes 2 important words `ZERO` and `ONE`.

In order to understand the message, you need to decrypt it. There are a few steps to decrypt the message:

1. Extract the occurrence of the word `ZERO` and `ONE` from the given string
   and put them to an array.


2. Transfer the extracted array to a new array with the following rules:
    - If the word is `ZERO`, replace it with `0`.
    - If the word is `ONE`, replace it with `1`.


3. The output of the previous code is still meaningless. To advance with the
   decryption, translate the binary numbers to decimal numbers. Every 8 bit into a byte.


4. Now we have the decimal numbers, we need to convert them to ASCII characters.


5. Finally, put all the characters together to get the final result as a string.


6. we came pretty far with the decryption. But we still have a problem. no body knows the leet language!<br>The B@MER
   sccientists have provided us some information that you need for the leet language. You only need to look for the
   folowing characters: `A, B ,E ,G ,I ,O ,Z` <br> They also provided more information to check the leet
   language. [Leet](https://en.wikipedia.org/wiki/Leet)

For example the following is the first message left by the hackers:

**ZERO**xpzxcp[zxzcdf**ONE**()_=ssdf-0sdf)**ZERO**sdfjksdkn_-9sdw**ZERO** **ONE**-**ZERO**amsmnfghjllse**ZERO**
nkjsdfvbakeo**ZERO**

And if you decrypt it, you will get almost the following steps:

```bash
arry = {"ZERO", "ONE", "ZERO", "ZERO", "ONE", "ZERO", "ZERO", "ZERO"}
arry = {"0", "1", "0", "0", "1", "0", "0", "0"}
arry = {72}
arry = {'H'}
String result = "H"
```

And the final result is `H`

---

**Input**

The first line and only line of the input contains series of characters — the message left by the hackers. can contain
any characters, including but not limited to spaces, numbers, and special characters.

**Output**

Print String — The message left by the hackers.


---

**Examples**

- Example 1

**Input**

``` bash
 ZERO gibirish ONE gibirish ZERO gibirish ZERO
 gibirish ONE gibirish ZERO gibirish
 ZERO gibirish ZERO 
```

**Output**

```bash
H
```

- Example 2

**Input**

```Java
ZERO gibirish ONE gibirish ZERO gibirish ZERO
 gibirish ONE gibirish ZERO
gibirish ZERO
 gibirish ZERO gibirish ZERO gibirish
 ZERO gibirish ONE gibirish
    ONE gibirish ZERO gibirish 
    ONE gibirish ZERO gibirish ZERO gibirish ZERO
gibirish ONE gibirish
 ZERO gibirish ZERO gibirish ZERO
  gibirish ZERO gibirish
       ONE gibirish ONE gibirish
        ZERO gibirish ONE gibirish
         ZERO gibirish ZERO
gibirish
 ONE gibirish ZERO 
 gibirish ONE gibirish ONE gibirish ZERO gibirish
ZERO gibirish ONE 
gibirish ONE gibirish ZERO gibirish ZERO 
gibirish ONE
gibirish ONE gibirish ZERO
 gibirish ONE gibirish ZERO
  gibirish ONE gibirish
     ZERO gibirish ZERO gibirish ONE
      gibirish ZERO gibirish ZERO gibirish ZERO
 gibirish ONE gibirish ONE
  gibirish ZERO gibirish ONE gibirish ZERO
      gibirish ONE 
```

**Output**

```bash
HACKER5
```

---

**Note**

The text in place of `gibirish` can be any text and can contain any characters,
including but not limited to spaces, numbers, and special characters except "\n".

**Note 2**

Your code will be tested with MOSS system(measure of software similarity) and will be checked for plagiarism and usage
AI(Including ChatGPT).
Be careful with the input and output format. The input and output format should be exactly the same as the example.
Otherwise, you will get a wrong answer and you will lose points. An Online Judge([Link](https://www.domjudge.org/)) will
perform scoring the code, any hardcoded example in the code will be ignored by the system. Your code should be able to
work with different testcases. The file format for submission is `StudentID_Project.java`, where the `StudentID` is your
Biruni University Student ID. Obviously if the file format is different the system will not be able to grade the
submission. Your submission will be graded by 10 different testcases, each testcase is worth 10 points. The total score
for this assignment is 100 points.

- If your code is not runnable, you will get 0 points. So, make sure your code runs before submitting it.
- If your code doesn't give the correct output, you will get 0 points. So, make sure your code gives the correct output
  for the given examples before submitting it.
- Make sure that you do **NOT** use any randomly generated inputs inside the code or declare input as a fix variables.
  We expect your code to accept inputs from the users terminal.