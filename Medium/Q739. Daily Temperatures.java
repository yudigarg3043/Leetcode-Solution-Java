class Solution {
    static{
        for(int i=0;i<500;i++) dailyTemperatures(new int[] {});
    }

    public static int[] dailyTemperatures(int[] t) {
        int n = t.length, top=-1;
        int[] arr = new int[n];
        int[] temp = new int[n];
        for(int i=0;i<t.length;i++){
            while(top>-1 && t[i]>t[temp[top]]){
                int index = temp[top--];
                arr[index] = i - index;
            }
            temp[++top] = i;
        }
        return arr;
    }
}