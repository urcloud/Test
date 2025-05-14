import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			int P = Integer.parseInt(st.nextToken());

			if (!map.containsKey(P)) {
				map.put(P, new ArrayList<>());
			}
			ArrayList<String> list = map.get(P);
			list.add(name);
			map.replace(P, list);
		}

		ArrayList<Integer> key = new ArrayList<>(map.keySet());
		key.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (map.get(o1).size() == map.get(o2).size()) {
					return o1 - o2;
				}
				return map.get(o1).size() - map.get(o2).size();
			}
		});
		System.out.println(map.get(key.get(0)).get(0) + " " + key.get(0));
	}
}