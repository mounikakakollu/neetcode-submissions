class Solution {

    private void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i<n1; i++) {
            leftArray[i] = nums[i+start];
        }
        for (int i = 0; i<n2 ; i++) {
            rightArray[i] = nums[mid+i+1];
        }

        int i = 0, j= 0,k = start;
        while(i<n1 && j<n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }
    private void mergeSort(int[] nums, int start, int end) {
        if (start < end) {

            int mid = start+(end-start)/2;

            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);

        }
        

            
    }
    public List<List<Integer>> threeSum(int[] nums) {
        mergeSort(nums, 0, nums.length-1);

        List<List<Integer>> result = new ArrayList<>();
        

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] > 0) break;
            
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1, k = nums.length-1;;
            while(j<k) {
                int sum = nums[j]+nums[k] + nums[i];
                if (sum == 0) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
                    
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) {
                    j++;
                }
                } else if (sum<0) {
                    j++;
                } else {
                    k--;
                }
                
            }
        }
        return result;
        
    }
}
