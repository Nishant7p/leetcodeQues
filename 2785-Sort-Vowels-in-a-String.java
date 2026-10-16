class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int[] ch = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='A') ch[0]++;
            if (c=='E') ch[1]++;
            if (c=='I') ch[2]++;
            if (c=='O') ch[3]++;
            if (c=='U') ch[4]++;
            if (c=='a') ch[5]++;
            if (c=='e') ch[6]++;
            if (c=='i') ch[7]++;
            if (c=='o') ch[8]++;
            if (c=='u') ch[9]++;
        }

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||
                c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {

                while (ch[j] == 0) j++;

                char[] v = {'A','E','I','O','U','a','e','i','o','u'};
                sb.append(v[j]);
                ch[j]--;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}