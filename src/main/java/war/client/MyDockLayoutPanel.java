package war.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MyDockLayoutPanel extends Composite {

    private static MyDockLayoutPanelUiBinder uiBinder = GWT.create(MyDockLayoutPanelUiBinder.class);

    interface MyDockLayoutPanelUiBinder extends
            UiBinder<Widget, MyDockLayoutPanel> {
    }

    public MyDockLayoutPanel() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}