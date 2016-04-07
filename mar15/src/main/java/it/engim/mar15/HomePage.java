package it.engim.mar15;

import it.engim.beam.Persona;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.repeater.RepeatingView;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) throws SQLException {
		
            super(parameters);

		//add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here
            
            add(new NavbarPanel("menu"));
            
            //add(new MenuPanel("menu"));
            
            DocumentoPanel doc = new DocumentoPanel("docum");
           
           add(doc);
           
            EntityManager conn = PM.getEM();
            
            try {

                //Persona p = conn.find(Persona.class, new Integer(1));
                
                Persona p;
                
                RepeatingView listViewPers = new RepeatingView("pers");
                
                for (int i = 1; i <= 6; i++) {
                    
                    p = conn.find(Persona.class, i);
                    
                    //list.add(((Persona) p).getNome());
                    
                    String TempPers = ((Persona) p).getNome();
                    
                    Label temp = new Label(listViewPers.newChildId(), TempPers);
                    temp.setEscapeModelStrings(false); // protegge il codice html
                    
                    listViewPers.add(temp);
                    
                }
        
                add(listViewPers);
                
            }
            
            finally {
                
                conn.close();
                System.out.println("Passo di qui");
                
            }
            
            System.out.println("Qui arrivo se c'è la connessione");

    }
}