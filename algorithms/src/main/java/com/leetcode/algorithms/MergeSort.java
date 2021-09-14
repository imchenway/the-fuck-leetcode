package com.leetcode.algorithms;

/**
 * 归并排序
 *
 * @author David Chan
 * @date 2021/4/12
 */
public class MergeSort {

	public static void main(String[] args) {
		Comparable[] a = new Comparable[16];
		a[0] = "M";
		a[1] = "E";
		a[2] = "R";
		a[3] = "G";
		a[4] = "E";
		a[5] = "S";
		a[6] = "O";
		a[7] = "R";
		a[8] = "T";
		a[9] = "E";
		a[10] = "X";
		a[11] = "A";
		a[12] = "M";
		a[13] = "P";
		a[14] = "L";
		a[15] = "E";
		merge(a, 0, 0, 1);
	}

	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		Comparable[] aux = new Comparable[16];
		//将a[lo..mid]和a[mid+1..hi]归并
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++)
			//将a[lo..hi]复制到aux[lo..hi]
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++)
			//归并回到a[lo..hi]
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
}
