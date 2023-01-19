import java.awt.*;

public class EventHandlingAWT {

    public static void main(String[] args) {
        Frame frame = new Frame("Showing all AWT components");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a label
        Label lbl = new Label("This is a label");
        frame.add(lbl);

        // Create a button
        Button btn = new Button("Click Me");
        frame.add(btn);

        // Create a checkbox
        Checkbox cb = new Checkbox("Check This");
        frame.add(cb);

        // Create a list
        List lst = new List();
        lst.add("one");
        lst.add("two");
        lst.add("three");
        frame.add(lst);

        // Create a textField
        TextField txt = new TextField(20);
        frame.add(txt);

        // Create a Choice
        Choice ch = new Choice();
        ch.add("one");
        ch.add("two");
        ch.add("three");
        frame.add(ch);

        // Create a TextArea
        TextArea ta = new TextArea(10, 20);
        frame.add(ta);

        // Create a Scrollbar
        Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 10);
        frame.add(sb);
    }
}