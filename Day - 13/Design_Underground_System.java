class Design_Underground_System {

    Map<Integer, AInfo> arrival;
    Map<String, double[]> total;

    public UndergroundSystem() {
        arrival = new HashMap<>();
        total = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrival.put(id, new AInfo(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        AInfo arri = arrival.get(id);
        String key = arri.stationName+"_"+stationName;
        double[] pair = total.getOrDefault(key, new double[2]);
        int time = t - arri.time;
        pair[0] += time;
        pair[1]++; 
        total.put(key, pair);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+"_"+endStation;
        double[] pair = total.get(key);
        return pair[0]/pair[1];
    }
    class AInfo
    {
        int id;
        String stationName;
        int time;

        AInfo(int id,String stationName,int time)
        {
            this.id = id;
            this.stationName = stationName;
            this.time = time;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
