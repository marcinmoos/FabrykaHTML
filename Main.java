package fabrykahtml;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLWriter;


public class Main extends JFrame implements ActionListener{
    
    JButton news, info, photo, contact;
    FabrykaHTML fabryka;
    BufferedWriter zapisHTML, zapisCSS;
    HTMLDocument HTMLdoc;
    HTMLWriter zapiszHTML;
    JEditorPane textEditor;
    static Main okno;
    
    public static void main(String[] args) throws IOException{
        
        okno = new Main();
        okno.setTitle("Fabryka HTML");
        okno.setBounds(300, 200, 526, 100);
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setLayout(null);
        okno.setResizable(false);
        
        okno.news = new JButton("Aktualności");
        okno.info = new JButton("Wiadomości");
        okno.photo = new JButton("Zdjęcia");
        okno.contact = new JButton("Kontakt");
        okno.news.setBounds(0, 15, 130, 40);
        okno.info.setBounds(130, 15, 130, 40);
        okno.photo.setBounds(260, 15, 130, 40);
        okno.contact.setBounds(390, 15, 130, 40);
        
        
        okno.news.addActionListener(okno);
        okno.info.addActionListener(okno);
        okno.photo.addActionListener(okno);
        okno.contact.addActionListener(okno);
        
        okno.add(okno.news);
        okno.add(okno.info);
        okno.add(okno.photo);
        okno.add(okno.contact);
        
        okno.fabryka = new FabrykaHTML();
        
        okno.zapisHTML = new BufferedWriter(new FileWriter(new File("index.html")));
        okno.zapisCSS = new BufferedWriter(new FileWriter(new File("style.css")));
        String CSS = "<link rel=\"stylesheet\" href=\"style.css\">";

       
        okno.textEditor = new JEditorPane();
        okno.textEditor.setContentType("text/html");
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        
        DokumentHTML strona = null;
        
        String zawartoscHTML;
        
        try {
            if(e.getSource() == news){
                strona = fabryka.ProdukcjaHTML("news");
            }
            else if(e.getSource() == info){
                strona = fabryka.ProdukcjaHTML("info");

            }
            else if(e.getSource() == photo){
                strona = fabryka.ProdukcjaHTML("photo");
            }
            else if(e.getSource() == contact){
                strona = fabryka.ProdukcjaHTML("contact");
            }
            
            zawartoscHTML = strona.GenerujHTML();
            zapisCSS.write(strona.GenerujCSS());
            
            textEditor.setText(zawartoscHTML);
            HTMLdoc = (HTMLDocument) textEditor.getDocument();
            zapiszHTML = new HTMLWriter(zapisHTML, HTMLdoc);
            zapiszHTML.write();
            zapisCSS.close();
            zapisHTML.close();

            okno.dispose();
             
        } catch (IOException | BadLocationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}