package com.dodo.patterns.structural.composite;

public class Tree {
    TreeNode root = null;
    public Tree(String name) {
        root = new TreeNode(name);
    }
}