import java.util.*;

public class RotatedBinarySearch{

	public static boolean BS(int []nums,int n,int key){
		int start=0,end=n;

		while(start<=end){
			int mid=start+(end-start)/2;
			
			if(nums[mid]==key)return true;

			if(nums[start]<nums[mid]){
				if(nums[start]<=key && nums[mid]>=key){
					end=mid-1;
				}
				else{
					start=mid+1;
				}
			}

			else{
				if(key>=nums[mid] && key<=nums[end]){
					start=mid+1;
				}
				else{
					end=mid-1;
				}
			}
		}
		return false;
	}

	public static void main(String []args){
		int[] nums = {5,5,6,6,7,8,9,1,1,2,2,3,4};
		int n=nums.length;
		int key=11;
		System.out.println(BS(nums,n-1,key));
	}
}