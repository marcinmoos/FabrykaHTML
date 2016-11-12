package fabrykahtml;


public class FabrykaHTML {
    
    DokumentHTML ProdukcjaHTML(String rodzaj){
        DokumentHTML dokument = null;
        switch (rodzaj) {
            case "news":
                dokument = new Aktualnosci();
                break;
            case "info":
                dokument = new Informacje();
                break;
            case "contact":
                dokument = new Kontakt();
                break;
            case "photo":
                dokument = new Zdjecia();
                break;
        }
        return dokument;
    }

    
}
