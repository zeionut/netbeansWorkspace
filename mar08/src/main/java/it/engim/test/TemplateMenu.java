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
package it.engim.test;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 *
 * @author svilupposw
 */
public class TemplateMenu extends WebPage{
    
    public TemplateMenu(PageParameters parameters) {
        
        super(parameters);
        
        BookmarkablePageLink home = new BookmarkablePageLink("home", HomePage.class);
        BookmarkablePageLink pageTest = new BookmarkablePageLink("pageTest", PageTest.class);
        BookmarkablePageLink whoPage = new BookmarkablePageLink("whoPage", WhoPage.class);
        
        add(home);
        add(pageTest);
        add(whoPage);
        
    }
    
}
