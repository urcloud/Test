import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            members.add(new Member(age, name, i));
        }

        members.sort(Comparator.comparingInt((Member m) -> m.age)
                               .thenComparingInt(m -> m.order));

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }

        scanner.close();
    }

    
    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}