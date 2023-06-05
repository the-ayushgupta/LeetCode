class Check_If_It_Is_A_Straight_Line {
    public boolean checkStraightLine(int[][] coordinates) {
        int l = coordinates.length;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for(int i = 2; i < l;i++)
        {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if((y - y1)*(x - x2) != (y - y2)*(x - x1))
            {
                return false;
            }
        }
        return true;
    }
}
