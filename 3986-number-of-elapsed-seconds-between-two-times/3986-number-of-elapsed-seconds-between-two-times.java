class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int sth=Integer.parseInt(st.substring(0,2));
        int stm=Integer.parseInt(st.substring(3,5));
        int sts=Integer.parseInt(st.substring(6,8));

        int eth=Integer.parseInt(et.substring(0,2));
        int etm=Integer.parseInt(et.substring(3,5));
        int ets=Integer.parseInt(et.substring(6,8));

        int start=sth*3600+stm*60+sts;
        int end=eth*3600+etm*60+ets;
        return end-start;       
    }
}