1. class x { void dol() { } }
2. class Y extends X { void do2() { } }
3.
4. class Chrome {
5. public static void main (String [] args) {
6. X xl = new X() ;
7. X x2 = new Y() ;
8. Y yl = new Y() ;
9. // insert code here
10. }}

Which of the following,| inserted at line 9, will compile? (Choose all that apply.)
A. x2.do2() ;
B. (Y) x2. do2 () ;
C. ((Y)x2) .do2 () ;
D. None of the above statements will compile?