### 解题思路

1. 创建Set集合mySet，用于储存收集到的Key集合
2. 创建两个List列表temp, temp1，用于后续处理
3. 遍历可以进入的房间（拥有钥匙），收集其中的钥匙
4. 将未拥有的钥匙分别存入mySet以及temp1中去
5. 清空temp，将temp1中的钥匙存入temp，再清空temp1
6. 判断是否还有可以进入的房间（temp是否为空），没有的话结束循环，有的话重复3-6步骤
7. 判断是否收集了所有房间的钥匙，注意把0号房间的钥匙加上