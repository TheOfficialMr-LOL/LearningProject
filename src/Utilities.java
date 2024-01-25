public class Utilities {

    static int[] Bubble_sort_asc(int[] nums) {
            
            //Bubble Sort function
            for(int i:nums) {
                for(int j=0; j<(nums.length-1); j++){
                    if(nums[j]>nums[j+1]) {
                        int y=nums[j];
                        int x=nums[j+1];
                        nums[j+1]=y;
                        nums[j]=x;
                    }
                }
            }
            
            return nums;
    }
    
    static int[] Bubble_sort_desc(int[] nums) {
        
            
        //Bubble Sort function
        for(int i:nums) {
            for(int j=0; j<(nums.length-1); j++){
                if(nums[j]<nums[j+1]) {
                    int y=nums[j];
                    int x=nums[j+1];
                    nums[j+1]=y;
                    nums[j]=x;
                }
            }
        }
        return nums;
    }

    static String arrayToString(int[] nums) {

        String array="";
        for(int k:nums) {
            array+=k;
            if(k!=nums[nums.length-1]) {array+=", ";}
        }
        return array;
    }
}
