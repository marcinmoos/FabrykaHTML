package fabrykahtml;

import de.svenjacobs.loremipsum.LoremIpsum;
import java.util.Random;


public class Informacje extends DokumentHTML{

    public Informacje() {
        title = "Wiadomości";
        zawartoscHTML = "<div>" + new LoremIpsum().getParagraphs(new Random().nextInt(10)+1) + "</div>";
        zawarotscCSS = "body{font-family: Comic Sans, cursive, sans-serif }";
    }
  
}
