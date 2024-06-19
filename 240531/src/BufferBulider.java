public class BufferBulider {
  public static void main(String[] args) {


    // append vs. insert
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    System.out.println(sb);

    // 문자열 연산시, 빌더나 버퍼를 쓰는 것이 훨씬 효율적
//    String result = "";
//
//    result += "Hello";
//    result += "java";
//    result += "World";
//    System.out.println(result);
//
//    StringBuilder sb = new StringBuilder();
//    sb.append("Helllo");
//    sb.append("java");
//    sb.append("World");
//    System.out.println(sb.toString());
//
//    StringBuffer sf = new StringBuffer();
//    sf.append("Helllo");
//    sf.append("java");
//    sf.append("World");
//    System.out.println(sf.toString());
  }
}
