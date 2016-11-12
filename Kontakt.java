package fabrykahtml;

import java.util.Random;


public class Kontakt extends DokumentHTML{

    public Kontakt() {
        Random losowanie = new Random();
        title = "Kontakt";
        
        String miasta[] = {"Katowice", "Poznań", "Warszawa", "Nowa Wieś", "Radom", "Małe Swornegacie", "東京都"};
        String imiona[] = {"Jan Kowalski", "Adam Nowak", "Gal Anonim", "Jakiś Ktoś", "Pani Wiesia", "田中"};
        
        String adres = miasta[losowanie.nextInt(7)];
        String imie = imiona[losowanie.nextInt(6)];
        String telefon = "";
        for(int i=0; i<9 ;i++){
            telefon += Integer.toString(losowanie.nextInt(10));
            if((i == 2) || (i == 5))telefon += "-";
        }
        
        zawartoscHTML = "<div><b>Imię i nazwisko: </b>"+imie + "<br><b>Adres: </b>" + adres + "<br><b>Telefon: </b>" + telefon +"</b>"+"</div>";
        zawarotscCSS = "div{font-size:25px;}";
    }


    

    
}
