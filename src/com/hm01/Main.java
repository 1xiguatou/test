package com.hm01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N = 5;
    static int[][] matrix = {// 题目中例子所给的邻接矩阵
            {0, 20, 30, 10, 11},
            {15, 0, 16, 4, 2},
            {3, 5, 0, 2, 4},
            {19, 6, 18, 0, 3},
            {16, 4, 7, 16, 0}
    };
    static ArrayList<Integer> path = new ArrayList<>();
    static boolean[] visited = new boolean[N];
    static int min_cost = Integer.MAX_VALUE;

    public static void backtrack(int curr_city, int curr_cost) {
        if (path.size() == N) {
            // 如果已经访问完了所有城市
            min_cost = Math.min(min_cost, curr_cost + matrix[curr_city][0]);
            return;
        }
        for (int i = 0; i < N; i++) {
            // 遍历每个可达的节点
            if (!visited[i]) {
                visited[i] = true;// 标记已访问
                path.add(i);// 路径节点加入到 path 数组中
                backtrack(i, curr_cost + matrix[curr_city][i]);
                visited[i] = false;// 回溯
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // 从起点城市 0 开始
        Arrays.fill(visited, false);
        visited[0] = true;
        path.add(0);
        backtrack(0, 0);
        path.remove(path.size() - 1);
        visited[0] = false;
        System.out.println(min_cost); // 输出：28
    }
}

