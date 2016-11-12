package fabrykahtml;

import de.svenjacobs.loremipsum.LoremIpsum;
import java.util.Random;


public class Aktualnosci extends DokumentHTML{

    public Aktualnosci() {
        Random losowanie = new Random();
        title = "Aktualności";
        zawartoscHTML = "";
        for(int i=1;i<(losowanie.nextInt(6)+2);i++){
            zawartoscHTML += ("<h2>Artykuł " + i + "</h2> <div id=\"news\">" +
                    new LoremIpsum().getParagraphs(losowanie.nextInt(5)+1))+ "</div>";
        }
        zawarotscCSS = "#news{width:700px;}body{background-color:eeffee;}";
    }

    

    
}
