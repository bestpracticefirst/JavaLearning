package loader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClassLoaderTest {
    public static void main(String[] args) {
        try {
            System.out.println("classLoaderTest.getClass().getClassLoader() :"
                    + ClassLoaderTest.class.getClassLoader());
            System.out.println("classLoaderTest.getClass().getClassLoader().getParent :"
                    + ClassLoaderTest.class.getClassLoader().getParent());
            System.out.println("System.getClass().getClassLoader(): "+System.class.getClassLoader());
        } catch (Exception ex) {
            Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}
