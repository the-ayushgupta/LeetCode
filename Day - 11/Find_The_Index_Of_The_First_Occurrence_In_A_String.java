class Find_The_Index_Of_The_First_Occurrence_In_A_String {
    public int strStr(String haystack, String needle) {
        for(int i = 0;i <= haystack.length()-needle.length();i++)
        {
            String value = haystack.substring(i,i+needle.length());
            if(value.equals(needle)) return i;
        }
            return -1;
        
    }
}
