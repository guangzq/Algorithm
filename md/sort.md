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

## 动态规划
思想：大问题拆分成若干小问题
### 一.70.爬楼梯
典型的递归问题，解决递归问题的关键
* 1.找到递归的公式
* 2.找出递归的退出条件，防止内存溢出

针对此题，爬楼梯要么是1步，要么是2步，所以递归公式为f(n-1)+f(n-2),当只有一个台阶时,有一种走法，
当有两种台阶时，有两种走法，所以退出条件为f(1)=1和f(2)=2

### 二.[343. 整数拆分](https://leetcode-cn.com/problems/integer-break/)
要数学证明呀，先放着

### 三.[198. 打家劫舍](https://leetcode-cn.com/problems/house-robber/description/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china)

## 二叉树系列
### 高度和深度如何定义
* 高度为深度+1，深度为从根节点到叶子结点的层高
### 广度优先遍历(BFS:Breadth First Search)和深度优先遍历(DFS:Depth First Search)
1. 深度优先遍历：从根节点开始，按照纵向遍历左子树，直到找到叶子节点为止，然后回到前一个节点，遍历右子树，直到
遍历完所有的可达节点
2. 广度优先遍历：从根节点开始，在横向遍历二叉树层段节点的基础上纵向遍历二叉树的层次。
> [代码实现](https://blog.csdn.net/mingwanganyu/article/details/72033122)

### [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)
深度优先遍历
* 终止条件：根节点为空
* 找出返回值：如果根节点为空，则返回高度为0；如果不为空，则取左右子树的高度+1

### [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)
层序遍历和二叉树的广度优先遍历类似，只不过每一层输出的是二维数组

### [98.BST与其验证](https://leetcode-cn.com/problems/validate-binary-search-tree/)
可以利用中序遍历，即左根右的顺序，设置pre为long的min(int的min容易与左子树的第一个值重合)，
如果root.val<=pre,则返回false,直到遍历完整颗二叉树，则证明是搜索二叉树

### [110. 平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree/)
判断平衡二叉树的定义就是左右子树高度相差不能大于1，否则就不平衡了
* 用递归分别求左右子树的高度，如果相差大于1，则不平衡
* 如果求深度时为-1，则应提前判断-1
### [222. 完全二叉树的节点个数](https://leetcode-cn.com/problems/count-complete-tree-nodes/)
递归递归


