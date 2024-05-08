
class Student {

    static {
        System.out.println("Class In Loaded!");
    }

    public Student() {
        System.out.println("Object Created");
    }

    int Rollno = 27;
}

public class DynamicClassLoading {
    public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException {
        // String classToLoad = "Student";

        // Class c = Class.forName(classToLoad);

        
        // Object obj = c.newInstance();

        // Student s = (Student)obj;
    }
}
