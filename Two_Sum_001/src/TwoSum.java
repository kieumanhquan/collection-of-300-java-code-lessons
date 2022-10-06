import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class TwoSum {

    // Độ phức tạp về thời gian: O(n^2)
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    // Độ phức tạp về thời gian: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    // Độ phức tạp về thời gian: O(n*log(n))
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử trong màng: ");
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử số nguyên thứ " + i + " : ");
            nums[i] = keyboard.nextInt();
        }

        System.out.print("Nhập giá trị kỳ vọng(Số nguyên): ");
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = findTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.print("=> Kết quả tìm được là: ");
            System.out.println("{" + indices[0] + "; " + indices[1] + "}");
        } else {
            System.out.println("Không tìm thấy kết quả!");
        }
    }
}