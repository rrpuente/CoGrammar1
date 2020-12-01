import​ java.util.*; ​
import​ javax.swing.*; 

public​ ​class​ ​do_whilePassword​ {
    
    ​public​ ​static​ ​void​ ​main​ ( String [] args ) {
        String choice = ​""​; 
        ​do​ {
​           //System.out.println( "Enter today's number from the menu:" ); 
            choice = JOptionPane.showInputDialog("Please enter in a password");
            // In Java you cannot compare strings like primitive types (using =)
            // When you use = to compare strings in Java, you are comparing if the objects are the same,
            // not if the value of the object is the same.
        } while​(choice != ​"John"​ ); 
    } 
}