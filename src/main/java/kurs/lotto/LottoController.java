package kurs.lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Michal Snopek on 11.07.2019.
 */
@Controller
public class LottoController {

   private LottoGenrator lottoGenrator;

   /*
            Jeśli mamy pole typu interfejsowego
            to przy incjalizacji zmiennaj musimy stworzyć
            obiekt klasy , która implementuje dany interfejs
            czyli w  tym prypadku LottoGenerator

   */

   public void setLottoGenrator(LottoGenrator lottoGenrator){
       this.lottoGenrator=lottoGenrator;
   }

    @GetMapping("/")
    public String generateRandomData(ModelMap map){
       setLottoGenrator(new HardLottoGenerator());
       map.put("numbers", lottoGenrator.GegerateDescription());
        return "lotto";

    }
}
