class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {

                if(needle.length() == 1) {
                    return i;
                }

                int index = 1;

                for(int j = i + 1; j < i + needle.length(); j++) {

                    if(haystack.charAt(j) != needle.charAt(index)) {
                        break;
                    }

                    index++;

                    if(index == needle.length()) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}
