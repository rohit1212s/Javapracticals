// Program to demonstrate for loop initialize inside the loop not outside and condition for exiting the loop in 2nd block inside the for loop
//optimize more so number of lines will be reduced
//Print A to Z
package com.k2js.forloop.practice;

class Pro7{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		
		for(char c='A';c<='Z'; System.out.println(c++));
		System.out.println("\n****End*****/");
	}
}


/***Output***

A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

****End*****/
