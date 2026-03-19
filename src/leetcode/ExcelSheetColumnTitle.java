class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber -= 1;

            int remainder = columnNumber % 26;
            sb.append((char) ('a' + remainder));
            columnNumber /= 26;
        }

        return sb.reverse().toString().toUpperCase();
    }
}
