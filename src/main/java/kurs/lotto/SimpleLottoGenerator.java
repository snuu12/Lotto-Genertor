package kurs.lotto;

import java.util.Arrays;
import java.util.List;


public class SimpleLottoGenerator implements LottoGenrator {
    @Override
    public List<Integer> generate() {
        List<Integer>list= Arrays.asList(1,5,10,15,20,26);
        return list;
    }

    @Override
    public String GegerateDescription() {

        return "1,5,10,15,20,26.";
    }
}
