/*
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.engim.apr05;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RefreshingView;
import org.apache.wicket.markup.repeater.RepeatingView;

/**
 *
 * @author svilupposw
 */
public class NavbarPanel extends Panel {
    
    public NavbarPanel(String id) {
        
        super(id);
        
        add(new BookmarkablePageLink("home", HomePage.class));
        add(new BookmarkablePageLink("profile", AboutUsPage.class));
        add(new BookmarkablePageLink("message", HomePage.class));
        
        RepeatingView tab = new RepeatingView("riga");
        
        ArrayList <String> list = new ArrayList<>();
        
        list.add("<a>Elemento 1</a>");
        list.add("<a>Elemento 2</a>");
        list.add("<a>Elemento 3</a>");
        
        for (int i = 0; i < list.size(); i++) {
            
            Label temp = new Label(tab.newChildId(), list.get(i));
            temp.setEscapeModelStrings(false);
            tab.add(temp);
            
        }
        
        add(tab);
        
    }
    
    
    
}
