class Main {
  public static void main(String[] args) {
String[] words2={"apple","banana","peach","cherries","blueberries"};

//for each

for(String fruit:words2)
{
  System.out.println(fruit);
}
//for each fruits only with length 5
for(String fruit:words2)
{
 if(fruit.length()==5)
 {
    System.out.println(fruit);
 }
}
      for(int i=0;i<words2.length;i++)
      {String first= words2[i].substring(0,1);
      String last=words2[i].substring(words2[i].length()-1);
      System.out.println("index value "+i+"; " + words2[i]+" "+first+" "+last);
      }   
      int[] nums={12,65,80,70,34,32};
int sum=0;
for (int x:nums)
{
  sum+=x;
}
System.out.print("The average of nums is ");

System.out.printf("%.1f%n",((double)sum/nums.length));
      for(int i=(nums.length)-1;i>3;i--)
      {
        nums[i]=nums[i-1];
      }
      nums[3]=99;
      for(int i=0;i<nums.length;i++)
      {
      System.out.print(nums[i]+" ");
    }
    for(int i=2;i<(nums.length)-1;i++)
      {
        nums[i]=nums[i+1];
      }
      System.out.println();
    for(int i=2; i<nums.length-1;i++)
    {
      System.out.print(nums[i]+" ");
    }
    //shift left
    System.out.println();
    int[] nums2={1,2,3,4};
    int temp=nums2[0];
    for(int i=0; i<nums2.length-1;i++)
    {
      nums2[i]=nums2[i+1];
    }
    nums2[nums2.length-1]=temp;
      for(int i=0; i<nums2.length;i++)
    {
      System.out.print(nums2[i]+" ");
    }
    //shift right
        System.out.println();
    int temp2=nums2[nums2.length-1];
    for(int i=nums2.length-1;i>0;i--)
    {
      nums2[i]=nums2[i-1];
    }
    nums2[0]=temp2;
      for(int i=0; i<nums2.length;i++)
    {
      System.out.print(nums2[i]+" ");
    }
    //reverse
    System.out.println();
    for(int i=0;i<nums2.length-2;i++)
    {
      nums2[i]=nums2[i-1];
    }
  } 
}