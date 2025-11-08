static String replace(String str, String pattern, String replace) {
    int start = 0;
    int pos = 0;
    StringBuffer result = new StringBuffer();
    while ((pos = str.indexOf(pattern, start)) >= 0) {
        result.append(str.substring(start, pos));
        result.append(replace);
        start = pos + pattern.length();
    }
    result.append(str.substring(start));
    return result.toString();
}
