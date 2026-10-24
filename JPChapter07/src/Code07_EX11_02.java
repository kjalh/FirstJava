import java.util.*;

public class Code07_EX11_02 {
    public static HashMap<String, String> nara = new HashMap<String, String>();
    public static Scanner s = new Scanner(System.in);
    public static int num = 9;

    public static void in() {
        while (true) {
            System.out.printf("나라와 수도 입력%d>> ", ++num);
            String input = s.nextLine();
            if (input.equals("그만")) return;

            StringTokenizer st = new StringTokenizer(input, " ");

            String na = st.nextToken().trim();
            String su = st.nextToken().trim();

            if (nara.containsKey(na)) {
                System.out.println(na + "는 이미 있습니다.");
            } else {
                nara.put(na, su);
            }
        }
    }

    public static void quiz() {
        Random r = new Random();

        while (true) {
            List<String> keys = new ArrayList<>(nara.keySet());
            String randomKey = keys.get(r.nextInt(keys.size()));
            String correctCapital = nara.get(randomKey);

            System.out.print(randomKey + "의 수도는? ");
            String aa = s.nextLine();

            if (aa.equals("그만")) return;

            if (aa.equals(correctCapital)) 
                System.out.println("정답!!");
            else 
                System.out.println("아닙니다!!");
        }
    }

    public static void main(String[] args) {
        nara.put("그리스", "아테네");
        nara.put("독일", "베를린");
        nara.put("영국", "런던");
        nara.put("중국", "북경");
        nara.put("일본", "도쿄");
        nara.put("러시아", "모스크바");
        nara.put("태국", "방콕");
        nara.put("미국", "워싱턴");
        nara.put("프랑스", "파리");

        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

        while (true) {
            System.out.print("입력: 1, 퀴즈: 2, 종료: 3 >> ");
            int menu = s.nextInt();
            s.nextLine();
            
            switch (menu) {
                case 1:
                    in();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
            }
        }
    }
}
