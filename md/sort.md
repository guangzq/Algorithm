## 链表、队列与栈
### 优先级队列
普通队列是先进先出，即从队尾添加，对首删除，而优先级队列则赋予了优先级，最大优先级的先出，通常用**堆**来实现

## 滑动窗口
滑动窗口指的是利用双指针间距作为一个窗口，两个指针的移动可以为解决问题创造条件
### 一. [239. 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)
### 二.[3. 无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
定义两个指针start和end
1. 如果map中包含key，则将start指针移动key对应的最大value
2. 更新ans
### 三.[209. 长度最小的子数组](https://leetcode-cn.com/problems/minimum-size-subarray-sum/)
定义两个指针left和right,
1. right右移，并记录之前的累加之和
2. left右移，直到前面之和大于等于s，此时记录min
### 四.[26. 删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/)
定义两个指针start和end，分别指向0和1
1. 如果值相等，则将end+1
2. 如果不等，则将end的值赋给start+1,并将start+1
3. 返回start+1

