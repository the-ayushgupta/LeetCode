class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
/*        char a = letters[0];
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i] > target)
            {
                a = letters[i];
            }
        }
        return a;
*/
        for (var a : letters)
        {
            if(a > target)
            {
                return a;
            }
        }
        return letters[0];
    }
}
