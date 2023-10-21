import model.Student;
import statickeywordnevergivesuchname.Teacher;

public class Main {

    public static void main(String[] args) {

        /*School school = new School();
        School webler = new School("Webler");
        String name = webler.getName();

        System.out.println(school);
        System.out.println(webler);
        System.out.println(name);
        System.out.println("-----");

        Object shcoolObject = new School();
        System.out.println(shcoolObject);
        Object weblerObject = new School("Webler");
        System.out.println(weblerObject);

        System.out.println("-----");
        Student student = new Student("Péter", "Futó");
        student.printFullName();
        Object studentObject = new Student("Péter", "Futó");

        Student opposite = new Student("Futó", "Péter");
        System.out.println(opposite);

        System.out.println("-----");

        String firstName = "Roland";
        String lastName = "Szőke";
        Student roland = new Student(firstName, lastName);
        Student wrongRoland = new Student(lastName, firstName);

        System.out.println(roland);
        System.out.println(wrongRoland);

        System.out.println("-----");

        // ha egyszer használsz metódusát!!!
        new Student("László", "Földházi").printFullName();
        new Student("László", "Földházi").attendingSchool();


        System.out.println("-----");
        Student gyepi = new Student();
        gyepi.setFirstName("Gyepi");
        System.out.println(gyepi);
        String firstNameGyepi = gyepi.getFirstName();
        System.out.println(firstNameGyepi);
        String lastNameGyepi = gyepi.getLastName();
        System.out.println(lastNameGyepi);
        gyepi.printFullName();*/

        /*Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        Triangle triangleWithoutParam = new Triangle();
        System.out.println(triangleWithoutParam);
        Triangle triangleWithoutParamSetLater = new Triangle();
        triangleWithoutParamSetLater.setA(3);
        triangleWithoutParamSetLater.setB(4);
        triangleWithoutParamSetLater.setC(5);
        System.out.println(triangleWithoutParamSetLater); // nem jó, mert a perimeter és az area értéke 0 lesz, mivel előbb minden létrejön nullával!!!

        System.out.println("-----");

        Triangle triangleSecond = new Triangle();
        triangleSecond.setA(3);
        triangleSecond.setB(4);
        triangleSecond.setC(5);
        System.out.println(triangleSecond);

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1);

        System.out.println("-----");
        System.out.println("parent - child");
        parent.Triangle triangleParent = new parent.Triangle(3, 4, 5);
        System.out.println(triangleParent);

        System.out.println("-----");
        System.out.println("child - parent");
        Shape shape = new Shape();
        System.out.println(shape);

        System.out.println("-----");
        System.out.println("child - child");
        Shape shapeFromChild = new (5, 6, 10);
        System.out.println(shapeFromChild);*/

        Teacher teacher = new Teacher();
        teacher.setFirstName("Gyepi");
        Teacher csaba = new Teacher("Csaba", "Vadász");
        System.out.println(teacher);
        System.out.println(csaba);

        Student.Hello hello = new Student.Hello();
        hello.displayHello();
    }
}
