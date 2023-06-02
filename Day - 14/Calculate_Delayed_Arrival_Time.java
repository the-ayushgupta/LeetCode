class Calculate_Delayed_Arrival_Time {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime < 24)
        {
            return arrivalTime+delayedTime;
        }
        else if(arrivalTime+delayedTime == 24)
        {
            return 0;
        }
        return (arrivalTime+delayedTime)%24;
    }
}
