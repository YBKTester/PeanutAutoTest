package com.bink.lesson.day0805;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构
 * 1、栈        先进后出
 * 2、队列      先进先出
 * 3、数组     查询快、增删慢（地址连续；长度固定，创建新数组，接受数据）
 * 4、链表     查询慢、增删快（地址不连续，每次从头开始查询；增删不影响自身结构）
 * 5、红黑树
 *
 * @author yangbingkun
 * 2020/8/5 --3:37 下午
 */
public class BinaryTree {
    /**
     * 左子树
     */
    public BinaryTree left;
    /**
     * 右子树
     */
    public BinaryTree right;
    /**
     * 根节点
     */
    public BinaryTree root;
    /**
     * 存储数据
     */
    private Object data;
    /**
     * 数据列表
     */
    public List<BinaryTree> datas;

    /**
     * 构造一个节点，包含左子树、存储数据、右子树
     *
     * @param left  左子树
     * @param right 右子树
     * @param data  存储数据
     */
    public BinaryTree(BinaryTree left, Object data, BinaryTree right) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    /**
     * 将初始节点的左右子树值设为空
     *
     * @param data 存储数据
     */
    public BinaryTree(Object data) {
        this(null, data, null);
    }

    public BinaryTree() {
    }

    public void create(Object[] objects) {
        datas = new ArrayList<>();
//        将一个数组值，依次转换为Node节点（不带有左右子树的值）
        for (Object object : objects) {
            datas.add(new BinaryTree(object));
        }
//        根节点
        root = datas.get(0);
        for (int i = 0; i < objects.length; i++) {
//            左孩子
            if (i * 2 + 1 < datas.size()) {
                datas.get(i).left = datas.get(i * 2 + 1);
            }
//            右孩子
//            避免偶数时，下标越界
            if (i * 2 + 2 < datas.size()) {
                datas.get(i).right = datas.get(i * 2 + 2);
            }
        }
    }

    /**
     * 先序遍历
     *
     * @param root 根节点
     */
    public void preOrder(BinaryTree root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 中序遍历
     *
     * @param root 根节点
     */
    public void inOrder(BinaryTree root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param root 根节点
     */
    public void afterOrder(BinaryTree root) {
        if (root != null) {
            System.out.println(root.data);
            afterOrder(root.left);
            afterOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Object[] array = {2, 4, 5, 7, 1, 6, 12, 32, 51, 22};
        binaryTree.create(array);
        binaryTree.preOrder(binaryTree.root);
        System.out.println("=========================");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("=========================");
        binaryTree.afterOrder(binaryTree.root);
    }
}
