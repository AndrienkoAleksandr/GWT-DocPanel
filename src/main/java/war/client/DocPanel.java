package war.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DocPanel implements EntryPoint {

    public void onModuleLoad() {
        MyDockLayoutPanel myDockLayoutPanel = GWT.create(MyDockLayoutPanel.class);
        RootLayoutPanel.get().add(myDockLayoutPanel);
    }
}
