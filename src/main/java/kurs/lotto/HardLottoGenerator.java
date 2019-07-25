package kurs.lotto;

import java.util.*;

/**
 * Created by Michal Snopek on 11.07.2019.
 */
public class HardLottoGenerator implements LottoGenrator  {





        @Override
        public List<Integer> generate() {
            Set<Integer> numbers = new TreeSet<>();
            while (numbers.size()<6) {
                int number = (int) (Math.random()* 49 + 1);
                numbers.add(number);
            }

            List<Integer> integerList = new ArrayList<>();
            integerList.addAll(numbers);

            return integerList;
        }

    @Override
    public String GegerateDescription() {
        return generate().toString();
    }


}
