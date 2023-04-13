package com;

import java.util.Scanner;

public class TSP {
    static int max = 100;
    static int num;
    static int[][] g = new int[max][max];
//    static int[][] g = new int[][]{
//        {0,20,30,10,11},
//        {15,0,16,4,2},
//        {3,5,0,2,4},
//        {19,6,18,0,3},
//        {16,4,7,16,0}};
    static int[] x = new int[max];
    static int[] bestx = new int[max];
    static int cl = 0;
    static int best = max;

    // 交换函数
    static void swap(int a, int b) {
        int tem = x[a];
        x[a] = x[b];
        x[b] = tem;
    }

    // 界定函数
    static int bound(int t) {
        int min1 = max, min2 = max, temmin = 0;
        for (int i = t; i <= num; i++) {
            // 求min1
            if (g[x[t - 1]][x[i]] != -1 && g[x[t - 1]][x[i]] < min1) {
                min1 = g[x[t - 1]][x[i]];
            }
            // 求min2
            for (int j = 1; j <= num; j++) {
                if (g[x[i]][x[j]] != -1 && g[x[i]][x[j]] != 0 && g[x[i]][x[j]] < min2) {
                    min2 = g[x[i]][x[j]];
                }
            }
            temmin += min2;
        }
        return cl + min1 + temmin;
    }

    // 进行搜索
    static void prim(int t) {
        if (t > num) {
            if (g[x[num]][1] != -1 && cl + g[x[num]][1] < best) {
                for (int i = 1; i <= num; i++) {
                    bestx[i] = x[i];
                }
                best = cl + g[x[num]][1];
            }
        } else {
            for (int j = t; j <= num; j++) {
                if (g[x[t - 1]][x[j]] != -1 && bound(t) < best) {
                    swap(j, t);
                    cl += g[x[t - 1]][x[t]];
                    prim(t + 1);
                    // 回溯
                    cl -= g[x[t - 1]][x[t]];
                    swap(j, t);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入城市数： ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            x[i] = i;
            bestx[i] = 0;
        }

        System.out.println("输入城市之间的距离矩阵：");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                g[i][j] = in.nextInt();
            }
        }

        prim(2);

        System.out.print("从1号城市出发，经过所有城市回到起点顺序为： ");
        for (int i = 1; i <= num; i++) {
            System.out.print(bestx[i] + " --> ");
        }
        System.out.println("1");
        System.out.println("最短距离为：" + best);
    }
}
//0 20 30 10 11
//15 0 16 4 2
//3 5 0 2 4
//19 6 18 0 3
//16 4 7 16 0