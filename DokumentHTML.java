package fabrykahtml;


public abstract class DokumentHTML {
    String title;
    String zawartoscHTML;
    String zawarotscCSS;


    public String GenerujHTML(){
        return "<title>"+title+"</title>" +
               "<meta charset=\"UTF-8\">" +
               "<link rel=\"stylesheet\" href=\"style.css\">" + 
               "<h1>" + title + "</h1>" +
               zawartoscHTML;
    }
    public String GenerujCSS(){
        return "h1{text-align: center;}" + zawarotscCSS;
    }
    
    
}
