package DuplicationDelete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class DuplicationCheck {

	private List<Integer> Numbers = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
    View v = new View();

    public List<Integer> selectNumbers() {
    	for (int i = 0; i < 3; i++) {
            int inputNumber;
            do {
                try {
                    v.numberInput();
                    inputNumber = sc.nextInt();
                    if (isDuplicated(inputNumber)) {
                        throw new RuntimeException("중복된 값입니다. 다시 입력하세요.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    sc.nextLine(); // 입력 버퍼 비우기
                    continue;
                }
                break;
            } while (true);

            Numbers.add(inputNumber);
        }
        return Numbers;
    }

    private boolean isDuplicated(int inputNumber) {
        return Numbers.contains(inputNumber);
    }
}
