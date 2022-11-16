package week11;

public class Java_02 {
    // 문자열 압축
    public static void main(String[] args) {
        String str = "aabbaccc";

        String tmpResult = "";
        String result = str;
        for (int i = 1; i < str.length() / 2 + 1; i++) {
            tmpResult = "";
            String tmp = str.substring(0, i);
            System.out.println("tmp = " + tmp);
            int count = 1;
            for (int j = i; j < str.length(); j += i) {
                System.out.println("index = " + j + ", " + (j + i));
                if ((j + i) > str.length()) {
                    break;
                }
                String tmp2 = str.substring(j, j + i);
                System.out.println("tmp2 = " + tmp2);

                if (tmp.equals(tmp2)) {
                    count += 1;
                } else {
                    if (count < 2) {
                        tmpResult += tmp;
                    } else {
                        tmpResult += count + tmp;
                        count = 1;
                    }
                    tmp = tmp2;
                }
            }
//            System.out.println(tmpResult);
            if (tmpResult.length() < result.length()) {
                result = tmpResult;
            }
        }
        System.out.println(result);
    }
}
