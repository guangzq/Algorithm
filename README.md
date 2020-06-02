# Algorithm
数据结构和算法练习

## 70.爬楼梯
典型的递归问题，解决递归问题的关键
* 1.找到递归的公式
* 2.找出递归的退出条件，防止内存溢出

针对此题，爬楼梯要么是1步，要么是2步，所以递归公式为f(n-1)+f(n-2),当只有一个台阶时,有一种走法，
当有两种台阶时，有两种走法，所以退出条件为f(1)=1和f(2)=2
