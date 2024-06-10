public class RemoveChar {
    public static void main(String[] args) {
        //주어진 문자열에서 모든 별표(*)와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.

        System.out.println(starSideDel("cd*zq")); // "cq"
        System.out.println(starSideDel("ab**cd")); // "ad"
        System.out.println(starSideDel("wacy*xko")); // "wacko"
        System.out.println(starSideDel("wacyxko*")); // "wacko"
    }
    public static String starSideDel(String s) {
        String result = "";
        if (s.charAt(0) != '*') result += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)!='*' && s.charAt(i)!='*'){
                result += s.charAt(i);
            }
            if(s.charAt(i)=='*' && s.charAt(i-1)!='*'){
                result = result.substring(0, result.length()-1);
            }
        }
        return result;
    }
}
