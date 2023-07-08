class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int booking[] : bookings){
            int start = booking[0]-1;
            int end = booking[1];
            int seats = booking[2];
            ans[start] +=seats;
            if(end <n) ans[end] -= seats;
        }
        for(int i=1;i<n;i++) ans[i] += ans[i-1];
        return ans;
    }
}
