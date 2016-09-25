package com.algorithm.sort;

/**
 * 二分查找法
 * 
 * @author phantomfjh
 *
 */
public class BinarySort {

	/**
	 * 二分查找
	 * 
	 * @param array
	 * @return
	 */
	public int binarySearch(int[] array, int target) {
		// 边界条件检查
		if (array == null || array.length == 0) {
			return -1;
		}
		// start + 1 < end 表示， 当指针指到两个元素，相邻或者相交的时候， 循环停止。
		// 这样的话在最终分情况讨论的时候，只用考虑1～2 个元素。
		int start = 0, end = array.length - 1;
		while (start + 1 < end) {
			// start + (end - start) /
			// 2 写C++ 和 Java的同学要考虑到int overflow的问题， 所以需要考虑边界情况。
			int mid = start + (end - start) / 2;
			/*
			 * A[mid] ==, >, < 在循环中， 分三种情况讨论边界。 要注意， 在移动 start 和 end 的时候， 只要单
			 * 纯的把指针指向 mid 的位置， 不要 +1 或者 -1 。 因为只移动边界到 mid 的位置， 不会误删除
			 * target。在工程中，尽量在程序最后的时候统一写 return , 这样可以增强可读性。
			 */
			if (array[mid] == target) {
				start = mid;
			} else if (array[mid] < mid) {
				start = mid;
			} else {
				end = mid;
			}

		}
		/*
		 * A[start], A[end]? target 在循环结束时，因为只有1～2个元素需要讨论，所以结果非常容易解释清楚。
		 * 只存在的2种情况为， 1. start + 1 == end 边界指向相邻的两个元素， 这时只需要分情况讨 论 start 和 end
		 * 与target的关系，就可以得出结果。
		 */
		if (array[start] == target) {
			return start;
		}
		if (array[end] == target) {
			return end;
		}
		return -1;

	}

}
