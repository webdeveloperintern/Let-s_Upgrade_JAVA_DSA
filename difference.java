import java.util.*;

public class difference {
  public static void main(String[] args) {
    int []arr={7,9,5,6,3,2};
    Arrays.sort(arr);
    int temp;
    for(int i=0;i<arr.length;i++)
    {
        for (int j = i+1; j < arr.length; j++) {     
      if(arr[j]>arr[i])
      {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }}
    }
    int diff = arr[0]-arr[1];
      System.out.println("Difference = "+diff);
  }
}
