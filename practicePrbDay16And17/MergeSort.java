package practicePrbDay16And17;

public class MergeSort {
		private int data[];
		private int length;
		private int[] tempArray;

		public void sort(int inputData[]) {
			this.data = inputData;
			this.length = inputData.length;
			this.tempArray = new int[length];
			mergeSort(0, length - 1);
		}

		private void mergeSort(int lowerIndex, int higherIndex) {
			if (lowerIndex < higherIndex) {
				int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

				mergeSort(lowerIndex, middle);

				mergeSort(middle + 1, higherIndex);

				mergeParts(lowerIndex, middle, higherIndex);
			}
		}

		private void mergeParts(int lowerIndex, int middle, int higherIndex) {
			for (int i = lowerIndex; i <= higherIndex; i++) {
				tempArray[i] = data[i];
			}
			int i = lowerIndex;
			int j = middle + 1;
			int k = lowerIndex;
			while (i <= middle && j <= higherIndex) {
				if (tempArray[i] <= tempArray[j]) {
					data[k] = tempArray[i];
					i++;
				} else {
					data[k] = tempArray[j];
					j++;
				}
				k++;
			}
			while (i <= middle) {
				data[k] = tempArray[i];
				k++;
				i++;
			}
		}

		private static void printNumbers(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i != arr.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("\n");
		}

		public static void main(String args[]) {
			MergeSort ms = new MergeSort();
			int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

			printNumbers(arr);
			ms.sort(arr);

			printNumbers(arr);
		}

	}


