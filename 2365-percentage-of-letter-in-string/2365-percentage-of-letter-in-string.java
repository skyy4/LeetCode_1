class Solution {
    public int percentageLetter(String s, char letter) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); ++i)
            arr[s.charAt(i) - 'a']++;

        int occ = arr[letter - 'a'];
        return (occ * 100) / s.length();
    }
}