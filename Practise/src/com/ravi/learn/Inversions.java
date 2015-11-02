package com.ravi.learn;

//
//import java.io.BufferedReader;
//import java.io.DataInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Count number of split inversions in an array
// * 
// * @author anuragkapur
// */
//public class Inversions {
//
//	static int a[] = new int[100000];
//
//	/**
//	 * Assumes the 2 parts of the array are sorted, and merges them. While
//	 * merging, count split inversions
//	 * 
//	 * @param start
//	 * @param end
//	 * @param leftStart
//	 * @param leftEnd
//	 * @param rightStart
//	 * @param rightEnd
//	 * @return
//	 */
//	public static long countSplitInversionsAndMerge(int start, int end,
//			int leftStart, int leftEnd, int rightStart, int rightEnd) {
//		int subArray1[] = new int[leftEnd - leftStart + 1];
//		int subArray2[] = new int[rightEnd - rightStart + 1];
//
//		int count = 0;
//		for (int i = leftStart; i <= leftEnd; i++) {
//			subArray1[count++] = a[i];
//		}
//		count = 0;
//		for (int i = rightStart; i <= rightEnd; i++) {
//			subArray2[count++] = a[i];
//		}
//
//		// merge and count inversions
//		int leftPointer = 0, rightPointer = 0;
//		long inversions = 0;
//		for (int i = start; i <= end; i++) {
//			if (leftPointer >= subArray1.length) {
//				a[i] = subArray2[rightPointer++];
//
//			} else if (rightPointer >= subArray2.length) {
//				a[i] = subArray1[leftPointer++];
//
//			} else if (subArray1[leftPointer] <= subArray2[rightPointer]) {
//				a[i] = subArray1[leftPointer++];
//
//			} else if (subArray1[leftPointer] > subArray2[rightPointer]) {
//				for (int j = leftPointer; j < subArray1.length; j++) {
//					// System.out.println(subArray1[j] + "," +
//					// subArray2[rightPointer]);
//				}
//				a[i] = subArray2[rightPointer++];
//				inversions = inversions + subArray1.length - leftPointer;
//			}
//		}
//		return inversions;
//	}
//
//	/**
//	 * Recursive method to count left and right inversions
//	 * 
//	 * @param start
//	 * @param end
//	 * @return
//	 */
//	public static long countInversionsAndSort(int start, int end) {
//		// System.out.println("start :: " + start + " end :: " + end);
//		if (end - start == 1) {
//			// two elements in array, just sort them and return if this is an
//			// inversion
//			if (a[start] > a[end]) {
//				int temp = a[start];
//				a[start] = a[end];
//				a[end] = temp;
//				return 1;
//			} else {
//				return 0;
//			}
//		} else if (end == start) {
//			// one element in array, no sorting required, can be a left / right
//			// inversion
//			return 0;
//		} else {
//			int leftStart = start;
//			int leftEnd = ((end - start) / 2) + start;
//			int rightStart = ((end - start) / 2) + start + 1;
//			int rightEnd = end;
//			long leftInversions = countInversionsAndSort(leftStart, leftEnd);
//			long rightInversions = countInversionsAndSort(rightStart, rightEnd);
//			long splitInversions = countSplitInversionsAndMerge(start, end,
//					leftStart, leftEnd, rightStart, rightEnd);
//
//			return leftInversions + rightInversions + splitInversions;
//		}
//	}
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//		File inputFile = new File("F:\\Algos Exam\\IntegerArray.txt");
//		String inputFilePath = inputFile.getAbsolutePath();
//
//		// read and parse input file
//		try {
//			String strLine = "";
//			int count = 0;
//			FileInputStream fstream = new FileInputStream(inputFilePath);
//			DataInputStream in = new DataInputStream(fstream);
//			BufferedReader br = new BufferedReader(new InputStreamReader(in));
//			while ((strLine = br.readLine()) != null) {
//				a[count++] = Integer.parseInt(strLine);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println(countInversionsAndSort(0, a.length - 1));
//	}
//}

// 40303438223383
// 2407905288
//33000421627

//package com.anuragkapur.ada1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Quick Sort
 * 
 * @author anuragkapur
 */
public class Inversions {

	private static int a[] = new int[10000];
	private static long comparisonsCount = 0;

	/**
	 * Returns first element as pivot
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int chooseFirstElementAsPivot(int start, int end) {
		return start;
	}

	/**
	 * Returns the last element as pivot
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int chooseLastElementAsPivot(int start, int end) {

		// Move pivot to start index.

		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		return start;
	}

	/**
	 * Returns the median of start, end and mid as pivot
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int chooseMedianOfThreeAsPivot(int start, int end) {

		int pivotIndex = -1;

		int mid = ((end - start) / 2) + start;
		int b[] = new int[3];
		b[0] = a[start];
		b[1] = a[mid];
		b[2] = a[end];

		Arrays.sort(b);
		if (b[1] == a[start]) {
			pivotIndex = start;
		} else if (b[1] == a[mid]) {
			pivotIndex = mid;
		} else {
			pivotIndex = end;
		}

		// Move pivot to start index.
		int temp = a[start];
		a[start] = a[pivotIndex];
		a[pivotIndex] = temp;

		return start;
	}

	/**
	 * Partitions the array about the pivot
	 * 
	 * @param start
	 * @param end
	 * @param pivot
	 */
	public static int partition(int start, int end, int pivotIndex) {

		// Update comparisonsCount
		comparisonsCount += (long) end - start;

		// Partition
		int i = start;
		int pivot = a[pivotIndex];

		for (int j = start; j <= end; j++) {
			if (a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		// Put pivot into correct position
		int temp = a[i];
		a[i] = pivot;
		a[pivotIndex] = temp;

		return i;
	}

	/**
	 * Quick sort
	 * 
	 * @param start
	 * @param end
	 */
	public static void sort(int start, int end) {
		if (end - start == 1) {
			// Base case, no recursive calls. 2 Element, just sort them.
			if (a[start] > a[end]) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}

			// Increment comparisons count by 1 as there is 1 comparison
			// happening here.
			comparisonsCount++;
		} else if (end <= start) {
			// Base case, only one element. Nothing to do.
		} else {
			int pivotIndex = chooseMedianOfThreeAsPivot(start, end);
			int partitionIndex = partition(start, end, pivotIndex);
			sort(start, partitionIndex - 1);
			sort(partitionIndex + 1, end);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile = new File("F:\\Algos Exam\\Quick.txt");
		String inputFilePath = inputFile.getAbsolutePath();

		// read and parse input file
		try {
			String strLine = "";
			int count = 0;
			FileInputStream fstream = new FileInputStream(inputFilePath);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {
				a[count++] = Integer.parseInt(strLine);
			}

			br.close();
			in.close();
			fstream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sort(0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println(comparisonsCount);
	}
}

// package com.ravi.learn;
//
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
//
// public class Inversions {
//
// public static void main(String[] args) throws IOException {
// long[] arr = new long[100000];
// long[] arr1 = new long[100000];
// int k = 0;
// File f = new File("F:\\Algos Exam\\IntegerArray.txt");
// BufferedReader br = new BufferedReader(new FileReader(f));
// String readLine = null;
// while ((readLine = br.readLine()) != null) {
// arr[k] = Long.parseLong(readLine);
// arr1[k++] = k;
// }
// MergeSort sort = new MergeSort();
// System.out.println(sort.sort(arr));
// br.close();
// }
//
// }
