public class RemoveElement {
        public static int removeElement(int[] nums , int val){
            int k = 0;

            for(int i = 0; i < nums.length ; i++){
                if(nums[i] != val){
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }

        public static void main(String[] args) {
            int[] nums = {8,5,7,8,3,9,8};
            int val = 8;
            int k = removeElement(nums , val);
            System.out.println("k = " + k);
            System.out.println("New array: ");
            for(int i = 0; i < k ; i++){
                System.out.println(nums[i] + " ");
            }
        }
    }

