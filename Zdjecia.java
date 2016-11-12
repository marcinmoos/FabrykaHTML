package fabrykahtml;



public class Zdjecia extends DokumentHTML{
    public Zdjecia(){
        title = "Zdjęcia";
        zawartoscHTML = "<div id=\"photo\">";
        for(int i=1;i<=4;i++){
            zawartoscHTML += "<img src=\""+i+".jpg\" width=\"400px\" />";
            if(i %2 == 0)zawartoscHTML += "<br>";
        }
        zawartoscHTML += "</div>";
        zawarotscCSS = "h1{color:white;}#photo { text-align: center;}body{background-color:black;}";
    }

}
