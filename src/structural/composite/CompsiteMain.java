package structural.composite;

public class CompsiteMain {
    public static void main(String[] args) {
        Project project = new Project("main");
                project.addToDo(new Todo("kup jaja"));
                project.addToDo(new Todo("kup mleko"));
        Project homework = new Project("praca domowa");
        homework.addToDo(new Todo("zadanie 1"));
        homework.addToDo(new Todo("zadanie 2"));
        homework.addToDo(new Todo("zadanie 3"));

        project.addToDo(homework);
        System.out.println(project.getContent());
    }
}
